package edu.bdeb.a13.adapter_exo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter weight in pounds (will be converted to kilograms) : ");
        double weightInPounds = scan.nextDouble();

        //Create the WeightMachineImpl object
        WeightMachine weightMachine = new WeightMachineImpl(weightInPounds);

        //Create the WeightMachineAdapterImpl object passing in the WeightMachineImpl object
        WeightMachineAdapter machineAdapterObj = new WeightMachineAdapterImpl(weightMachine);

        //Get the weight in kilograms
        double weightInKg = machineAdapterObj.getWeightInKg();

        //Print weight in kilograms
        System.out.printf("Weight in kilograms : %.2f\n", weightInKg);

        //Close the scanner
        scan.close();
    }
}