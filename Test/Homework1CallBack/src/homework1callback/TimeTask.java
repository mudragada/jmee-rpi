/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package homework1callback;

import java.util.Calendar;
import java.util.TimerTask;

/**
 *
 * @author v-mudrak-8L
 */
public class TimeTask extends TimerTask{
    private FiveMinuteListener listener;
    @Override
    public void run() {
        String sCurTime = Calendar.getInstance().getTime().toString().substring(11, 19);
        System.out.println("Time: " + sCurTime);
        if( sCurTime.charAt(4) == '5')
            listener.EveryFiveMinEvent(); 
    }
    
    public void addListener(FiveMinuteListener listener){
        this.listener = listener;
    }

    
    
}
