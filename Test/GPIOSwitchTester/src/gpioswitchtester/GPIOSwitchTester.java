/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gpioswitchtester;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.microedition.midlet.MIDlet;
import jdk.dio.DeviceNotFoundException;

/**
 *
 * @author v-mudrak-8L
 */
public class GPIOSwitchTester extends MIDlet {
    private GPIOSwitch gSwitch;
    @Override
    public void startApp() {
        gSwitch = new GPIOSwitch(0,17);
        try {
            gSwitch.start();
        } catch (DeviceNotFoundException ex){
            System.out.println("DeviceException - " + ex.getMessage());
            notifyDestroyed();
        } catch (IOException ex) {
            System.out.println("IOException - " + ex.getMessage());
            notifyDestroyed();
        }
        
    }
    
    @Override
    public void destroyApp(boolean unconditional) {
        try {
            gSwitch.stop();
        } catch (IOException ex) {
           System.out.println("IOException - " + ex.getMessage());
        }
    }
}
