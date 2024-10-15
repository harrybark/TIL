package thread.start;

import util.MyLogger;

import static util.MyLogger.log;

public class InnerRunnableMainV1 {

    public static void main(String[] args) {
        log("main() start");
        MyInnerRunnable myInnerRunnable = new MyInnerRunnable();
        Thread thread = new Thread(myInnerRunnable);
        thread.start();
        log("main() end");
    }

    static class MyInnerRunnable implements Runnable {
        @Override
        public void run() {
            log(Thread.currentThread().getName() + " : run() ");
        }
    }
}
