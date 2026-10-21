package domain;

public class Car extends Transport {
    public Car(String name, double baseRatePerKm) {
        super(name, baseRatePerKm);
    }

    @Override
    public double tripCost(double distance) {
        return distance * getBaseRatePerKm();
    }
}