package thread.start;

public class DaemonTheadMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ".main() :  Start ");
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true);
        daemonThread.start();
        System.out.println(Thread.currentThread().getName() + ".main() : End ");
    }

    static class DaemonThread extends Thread {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " : run() Start ");

            try {
                sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " : run() End");

        }
    }
}
