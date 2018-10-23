import java.util.Scanner;

public class Exercise2_3 {

    // (Convert meters into feet) Write a program that reads a number in meters,
    //  converts  it  to  feet,  and  displays  the  result.
    //  One  meter  is  3.2786  feet.

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Please, Enter Number of Meters");
        double meter = Input.nextDouble();
        double feet = 3.2786;
        double METER_TO_FEET = meter * feet;


        System.out.println("Feet = " + METER_TO_FEET);

    }
}
