package me.harry.designpatterns.designpatterns.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        /*
        * 새로운 인스턴스를 여러개 만들 수 있고, 이는 다른 주소를 가지므로 다른 객체이다.
        Settings settings1 = new Settings();
        Settings settings2 = new Settings();
        */

        Settings settings1 = Settings.getInstance();
        Settings settings2 = Settings.getInstance();

        // reflection
        Constructor<Settings> constructor = Settings.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Settings reflection = constructor.newInstance();

        System.out.println(settings1 == settings2);
        System.out.println(settings1 == reflection);


        ThreadSafeSettingsInnerSet set1 = ThreadSafeSettingsInnerSet.getInstance();
        ThreadSafeSettingsInnerSet set2 = null;

        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(set1);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            set2 = (ThreadSafeSettingsInnerSet) in.readObject();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(set1 == set2);

        ESettings setting1 = ESettings.INSTANCE;
        ESettings setting2 = null;

        Constructor<?>[] declaredConstructors = ESettings.class.getDeclaredConstructors();
        for ( Constructor<?> declaredConstructor : declaredConstructors ) {
            setting2 = (ESettings) declaredConstructor.newInstance("INSTANCE");
        }

        System.out.println(setting1 == setting2);

    }
}
