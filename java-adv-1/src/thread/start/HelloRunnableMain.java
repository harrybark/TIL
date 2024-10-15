package thread.start;

public class HelloRunnableMain {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ".main() :  Start ");

        HelloRunnable runnable = new HelloRunnable();
        Thread thread = new Thread(runnable);

        System.out.println(Thread.currentThread().getName() + ".start() :  Start ");
        thread.start();
        System.out.println(Thread.currentThread().getName() + ".start() :  End ");

        System.out.println(Thread.currentThread().getName() + ".main() : End ");
    }
}
