package org.example.factory;

import org.example.Vehicle;

import java.util.Optional;
import java.util.ServiceLoader;

/**
 * Inversion of Control
 * Dependency injection
 */
public class VehicleFactory {
    public Vehicle createVehicle() {
        ServiceLoader<Vehicle> serviceLoader = ServiceLoader.load(Vehicle.class);
        final Optional<Vehicle> vehicle = serviceLoader.stream().map(e -> e.get()).findFirst();
        if (vehicle.isPresent()) {
            return vehicle.get();
        }
        return null;
    }
}
