
package homework1callback;

import java.util.Calendar;
import java.util.TimerTask;

/**
 *
 * @author chaitanyamudragada
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
