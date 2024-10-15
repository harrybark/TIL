package thread.start.problems;

import util.MyLogger;

import static util.MyLogger.log;

public class CounterThread extends Thread {

    @Override
    public void run() {
        for(int i = 1 ; i < 6 ; i += 1 ) {
            log("value : " + i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
