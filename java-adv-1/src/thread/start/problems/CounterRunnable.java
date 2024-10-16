package thread.start.problems;

import static java.lang.Thread.sleep;
import static util.MyLogger.log;

public class CounterRunnable implements Runnable {

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
