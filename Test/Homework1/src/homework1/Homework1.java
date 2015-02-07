
package homework1;

import java.util.Timer;
import javax.microedition.midlet.MIDlet;

public class Homework1 extends MIDlet {
    private Timer myTimer;
    private Fiver fThread;
    private final long iFiverPeriod = 5*60*1000;
    @Override
    public void startApp() {
        myTimer = new Timer();
        fThread = new Fiver();
        long iDelay = fThread.getTimeDelay();
        if(iDelay >= 0)
            myTimer.schedule(fThread, iDelay, iFiverPeriod);
    }
    
    @Override
    public void destroyApp(boolean unconditional) {
        fThread.cancel();
        myTimer.cancel();
    }
}
