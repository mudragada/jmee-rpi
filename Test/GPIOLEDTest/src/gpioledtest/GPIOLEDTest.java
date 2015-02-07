package gpioledtest;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.microedition.midlet.MIDlet;
import jdk.dio.DeviceNotFoundException;

public class GPIOLEDTest extends MIDlet {

  GPIOLED pinTest;

  /**
   * Imlet lifecycle start method
   *
   * This method creates a GPIOLED, and invoked the blink method, to blink the
   * LED X number of times, in our case 8 times.
   */
  @Override
  public void startApp() {
    System.out.println("Starting GPIOLEDTest....");
    pinTest = new GPIOLED(23);
      try {
          pinTest.start();
      } catch (IOException ex) {
          Logger.getLogger(GPIOLEDTest.class.getName()).log(Level.SEVERE, null, ex);
      }
    pinTest.blink(8);
  }

  /**
   * Imlet lifecycle termination method
   *
   * @param unconditional If the imlet should be terminated whatever
   */
  @Override
  public void destroyApp(boolean unconditional) {
    try {
      if (pinTest != null) {
        pinTest.stop();
      }
    } catch (IOException ex) {
      System.out.println("IOException: " + ex);
    }
  }

}
