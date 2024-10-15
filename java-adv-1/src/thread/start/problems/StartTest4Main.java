package thread.start.problems;

import static java.lang.Thread.sleep;
import static util.MyLogger.log;

public class StartTest4Main {
    public static void main(String[] args) {
        PrintWork printWorkA = new PrintWork("A", 1000);
        PrintWork printWorkB = new PrintWork("B", 500);
        Thread thread1 = new Thread(printWorkA, "Thread-A");
        Thread thread2 = new Thread(printWorkB, "Thread-B");
        thread1.start();
        thread2.start();
    }

    static class PrintWork implements Runnable {
        private String content;
        private int sleepMs;

        public PrintWork(String content, int sleepMs) {
            this.content = content;
            this.sleepMs = sleepMs;
        }

        @Override
        public void run() {
            while ( true ) {
                log(content);

                try {
                    sleep(sleepMs);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
