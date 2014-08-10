/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gpiotest;
import constants.GPIOPinConstants;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.microedition.midlet.MIDlet;
import jdk.dio.DeviceConfig;
import jdk.dio.DeviceManager;
import jdk.dio.DeviceNotFoundException;
import jdk.dio.gpio.GPIOPin;
import jdk.dio.gpio.GPIOPinConfig;
import jdk.dio.gpio.PinEvent;
import jdk.dio.gpio.PinListener;

/**
 *
 * @author v-mudrak-8L
 */
public class GPIOTest extends MIDlet {
    private GPIOPin gLED;
    private final int ledID = GPIOPinConstants.GPIO23;
    @Override
    public void startApp() {
        try {
            gLED = DeviceManager.open(ledID);            
            gLED.setValue(true);
            
        for (int i = 0; (i < (10 * 2)); i++) {
            setValue(!getValue());
            Thread.sleep(500);
          }


        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
    
    @Override
    public void destroyApp(boolean unconditional) {
        try {
            gLED.setValue(false);
            gLED.close();
        } catch (IOException ex) {
            Logger.getLogger(GPIOTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }


    public void start() throws IOException, DeviceNotFoundException {

        // Open the LED pin (Output)
        gLED = DeviceManager.open(ledID);
        //Set LED initial value
        gLED.setValue(true);

        //Small pause is introduce
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
        }
    }
    public void setValue(boolean value) throws IOException {
    gLED.setValue(value);
    }
    public boolean getValue() throws IOException {
    return gLED.getValue();
    }

}
