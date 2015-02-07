
package com.examples;

import java.util.*;

/**
 *
 * @author chaitanyamudragada
 */
public class CounterDevice extends Thread {
    private List<CounterListener> listeners;
    private volatile boolean shouldRun = true;
    private volatile int count;
    private final int trigger;
    
    public CounterDevice(int trigger) {
        this.trigger = trigger;
        listeners = new ArrayList<>();
    }
    public void addCountListener(CounterListener listener) {
        listeners.add(listener);
    }
    @Override
    public void run() {
        resetCounter();
        while (shouldRun) {
            System.out.println("Current count..." + (++count));
            if (count == trigger) {
                // call back the listeners
                for (CounterListener c : listeners) {
                    c.countReached(count);
                }
            }
            // Reset the count over 10
            if (count > 9) {
                resetCounter();
            }
            try {
                sleep(2000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void stop() {
        shouldRun=false;
        interrupt();
    }
    private void resetCounter()
    {
        count = -1;
    }
}
