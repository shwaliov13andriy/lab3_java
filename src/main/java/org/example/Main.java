package app;

import domain.Car;
import domain.Motorcycle;
import domain.Transport;
import domain.Truck;

public class Main {
    public static void main(String[] args) {
        Transport[] fleet = {
                new Car("Car (Toyota Corolla)", 10.0),
                new Truck("Truck (Volvo FH)", 15.0, 5.0),
                new Motorcycle("Motorcycle (Yamaha R1)", 8.0)
        };

        double distance = 100.0;
        System.out.println("Розрахунок вартості поїздки на " + distance + " км:\n");

        for (Transport t : fleet) {
            System.out.printf("%s -> %.2f\n", t.getName(), t.tripCost(distance));
        }
    }
}