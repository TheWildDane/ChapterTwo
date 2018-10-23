import java.util.Scanner;

public class Exercise2_10 {

    public static void main(String[] args) {
        //(Science: calculating energy) Write a program that calculates the energy needed to  heat  water
        //  from  an  initial  temperature  to  a  final  temperature.
        //  Your  program  should prompt the user to enter the amount of water in kilograms and the initial
        // and final temperatures of the water. The formula to compute the energy is
        // Q = M * (finalTemperature – initialTemperature) * 4184
        // where M is the weight of water in kilograms,
        // temperatures are in degrees Celsius, and energy Q is measured in joules.

        Scanner Input = new Scanner(System.in);

        System.out.println("Enter the amount of water in kilograms:");
        double m = Input.nextDouble();
        double weightOfWaterInKilograms = m;
        System.out.println("Enter the initial temperature in Celsius:");
        double i = Input.nextDouble();
        double intialTemp = i;
        System.out.println("Enter the final temperature in Celsius:");
        double f = Input.nextDouble();
        double finalTemp = f;
        double q = m * (finalTemp - intialTemp) * 4184;
        System.out.println("The Energy needed to heat water is " +
                q + " Joules");
    }
}
