package domain;

public class Motorcycle extends Transport {
    public Motorcycle(String name, double baseRatePerKm) {
        super(name, baseRatePerKm);
    }

    @Override
    public double tripCost(double distance) {
        return distance * getBaseRatePerKm() * 0.8;
    }
}