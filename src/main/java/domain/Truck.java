package domain;

public class Truck extends Transport {
    private final double cargoWeightTonnes;

    public Truck(String name, double baseRatePerKm, double cargoWeightTonnes) {
        super(name, baseRatePerKm);
        this.cargoWeightTonnes = cargoWeightTonnes;
    }

    @Override
    public double tripCost(double distance) {
        return distance * getBaseRatePerKm() * (1 + 0.1 * cargoWeightTonnes);
    }
}