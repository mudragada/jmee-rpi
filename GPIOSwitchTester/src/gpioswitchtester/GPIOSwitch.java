/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gpioswitchtester;

import constants.GPIOPinConstants;
import java.io.IOException;
import jdk.dio.DeviceConfig;
import jdk.dio.DeviceManager;
import jdk.dio.gpio.GPIOPin;
import jdk.dio.gpio.GPIOPinConfig;
import jdk.dio.gpio.PinEvent;
import jdk.dio.gpio.PinListener;

/**
 *
 * @author v-mudrak-8L
 */
public class GPIOSwitch implements PinListener {
    private int switchPortId = 0;
    private int switchPinId = GPIOPinConstants.GPIO17;
    private GPIOPin switchPin;
    
    public GPIOSwitch (int switchPortId, int switchPinId){
        this.switchPortId = switchPortId;
        this.switchPinId = switchPinId;
    }
    
    public void start() throws IOException{
        
        GPIOPinConfig gSwitchConfig = new GPIOPinConfig(switchPortId, switchPinId, GPIOPinConfig.DIR_INPUT_ONLY,DeviceConfig.DEFAULT, GPIOPinConfig.TRIGGER_FALLING_EDGE, false);
        switchPin = DeviceManager.open(gSwitchConfig);
        switchPin.setInputListener(this);
    }
    
    public void stop() throws IOException{
        switchPin.setValue(false);
        switchPin.close();
    }

    @Override
    public void valueChanged(PinEvent event) {
       GPIOPin genPin = event.getDevice();
       if (genPin == switchPin){
            if(event.getValue() == true)
               System.out.println("TRUE");
            else if(event.getValue() == false)
                System.out.println("FALSE");
       }
    }
    
}
