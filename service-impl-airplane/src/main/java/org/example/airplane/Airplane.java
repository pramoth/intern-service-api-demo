package org.example.airplane;

import org.example.Vehicle;

public class Airplane implements Vehicle {
    @Override
    public void mobilize() {
        System.out.println("airplane mobilize");
    }
}
