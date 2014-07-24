/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.examples;

import javax.microedition.midlet.MIDlet;

/**
 *
 * @author v-mudrak-8L
 */
public class TestIMletListener extends MIDlet implements CounterListener{
    private CounterDevice device;

    @Override
    public void startApp() {
        System.out.println("Starting...");
        device = new CounterDevice(5);
        device.addCountListener(this);
        device.start();
    }

    @Override
    public void destroyApp(boolean unconditional) {
        System.out.println("Destroying...");
        device.stop();
    }

    @Override
    public void countReached(int count) {
        System.out.println("In TestIMlet: countReached: count: " + count);
    }
}
