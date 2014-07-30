/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package homework1;

import java.util.Timer;
import javax.microedition.midlet.MIDlet;

/**
 *
 * @author v-mudrak-8l
 */
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
