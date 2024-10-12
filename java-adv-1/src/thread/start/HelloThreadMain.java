package thread.start;

public class HelloThreadMain {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ".main() :  Start ");

        HelloThread thread = new HelloThread();
        System.out.println(Thread.currentThread().getName() + ".start() :  Start ");
        thread.start();
        System.out.println(Thread.currentThread().getName() + ".start() :  End ");

        System.out.println(Thread.currentThread().getName() + ".main() : End ");
    }
}
