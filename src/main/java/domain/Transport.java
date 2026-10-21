package domain;

public abstract class Transport {
    private final String name;
    private final double baseRatePerKm;

    public Transport(String name, double baseRatePerKm) {
        this.name = name;
        this.baseRatePerKm = baseRatePerKm;
    }

    public String getName() { return name; }
    protected double getBaseRatePerKm() { return baseRatePerKm; }

    public abstract double tripCost(double distance);
}