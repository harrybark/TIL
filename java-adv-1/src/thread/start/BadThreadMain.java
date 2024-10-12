package thread.start;

public class BadThreadMain {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ".main() :  Start ");

        HelloThread thread = new HelloThread();
        System.out.println(Thread.currentThread().getName() + ".start() :  Start ");
        thread.run();
        System.out.println(Thread.currentThread().getName() + ".start() :  End ");

        System.out.println(Thread.currentThread().getName() + ".main() : End ");
    }
}
