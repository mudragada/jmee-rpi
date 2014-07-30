/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package homework1;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author v-mudrak-8l
 */
public class Fiver extends TimerTask {
    private Dimer halfMinThread;
    private Timer myTimer;
    public Fiver()
    {
        System.out.println("Starting Time: " + getCurrentTime());
    }
    @Override
    public void run() {
        String sCurrentTime = getCurrentTime();
        System.out.println("Time: " + sCurrentTime);

        if (Integer.parseInt(sCurrentTime.substring(3,5))%10 > 0){
            halfMinThread = new Dimer();
            myTimer = new Timer();
            myTimer.schedule(halfMinThread, 0, 30000);
        }
        else
            myTimer.cancel();
    }
    public long getTimeDelay()
    {
        int iMins = Integer.parseInt(getCurrentTime().substring(3,5));
        int iSecs = Integer.parseInt(getCurrentTime().substring(6,8));
        long iDelay = 0;
        if((60 -iSecs) > 0 && (iMins % 5)> 0)
            iDelay = ((4 - (iMins % 5))* 60 + (60 - iSecs)) * 1000;
        //System.out.println("Mins:" + Integer.toString(iMins) + "iSecs" + Integer.toString(iSecs));
        return (iDelay > 0 ? iDelay : 0);
    }
    public String getCurrentTime(){
        Calendar cal = Calendar.getInstance();
        return cal.getTime().toString().substring(11, 19);
    }
    
}
