package edu.bdeb.a13.adapter_exo;

public class WeightMachineImpl implements WeightMachine {

    private double weightInPounds;

    public WeightMachineImpl(double weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

    @Override
    public double getWeightInPounds() {
        return this.weightInPounds;
    }
}
