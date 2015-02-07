
package homework1callback;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SecondThread extends Thread {
    private final int fiveMinutes = 5*60*1000;
    private volatile boolean shouldRun = true;
    private int delayTime;
    private int iNumRuns;
    
    public SecondThread(int delayTime)
    {
        this.delayTime = delayTime;
        iNumRuns = fiveMinutes/delayTime;
    }
    @Override
    public void run()
    {
        while (iNumRuns > 0)
        {
            System.out.println("Listening");
            try{
                sleep(delayTime);
            } catch (InterruptedException ex) {
            }
            --iNumRuns;
        }
    }
    public void stop()
    {
        shouldRun = false;
        interrupt();
    }
    /*Calculate number of runs in 5 minutes*/
    
    
}
