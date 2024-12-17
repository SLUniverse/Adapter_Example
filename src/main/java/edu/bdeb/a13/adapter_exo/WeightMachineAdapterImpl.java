package edu.bdeb.a13.adapter_exo;

public class WeightMachineAdapterImpl implements WeightMachineAdapter {
    WeightMachine machine;

    public WeightMachineAdapterImpl(WeightMachine machine) {
        this.machine = machine;
    }

    @Override
    public double getWeightInKg() {
        double weightInPound = machine.getWeightInPounds();
        return (weightInPound * 0.454);
    }
}
