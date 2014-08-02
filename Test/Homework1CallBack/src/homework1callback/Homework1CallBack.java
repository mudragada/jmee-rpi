/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package homework1callback;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import javax.microedition.midlet.MIDlet;

/**
 *
 * @author v-mudrak-8l
 */
public class Homework1CallBack extends MIDlet implements FiveMinuteListener{
    private final int fiveMinutes = 5*60*1000;
    private final int delayTime = 30*1000;
    private TimeTask myTimerTask;
    private Timer myTimer;
    private SecondThread secondThread;
    @Override
    public void startApp() {
        System.out.println("Starting Time:" + getCurrentTime());
        myTimerTask = new TimeTask();
        myTimerTask.addListener(this);
        myTimer = new Timer();
        myTimer.schedule(myTimerTask, getTimeDelay(), fiveMinutes);
    }
    
    @Override
    public void destroyApp(boolean unconditional) {
    }
    private long getTimeDelay()
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

    @Override
    public void EveryFiveMinEvent() {
        secondThread = new SecondThread(delayTime);
        secondThread.start();
    }
}
