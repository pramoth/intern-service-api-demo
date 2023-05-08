package org.example.client;

import org.example.Vehicle;
import org.example.factory.VehicleFactory;

/**
 * Inversion of Control
 */
public class App {
   
    public static void main(String[] args) {
        VehicleFactory vf = new VehicleFactory();
        Vehicle v = vf.createVehicle();
        v.mobilize();
    }
}
