package thread.start;

import util.MyLogger;

import static util.MyLogger.log;

public class ManyThreadMainV1 {

    public static void main(String[] args) {
        log("main() start");
        HelloRunnable runnable = new HelloRunnable();

        for(int i = 0 ; i < 100 ; i += 1) {
            Thread thread = new Thread(runnable);
            thread.start();
        }

        log("main() end");
    }
}
