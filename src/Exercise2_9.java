import java.util.Scanner;

public class Exercise2_9 {
    public static void main(String[] args) {

        //Write a program that prompts the user to enter the starting velocity v0 in meters/second,
        // the ending velocity v1 in meters/second,
        // and the time span t in seconds, and displays the average acceleration.

        Scanner Input = new Scanner(System.in);
        System.out.println("Please, Enter v0, v1 and t");
        double v0 = Input.nextDouble();
        double v1 = Input.nextDouble();
        double t = Input.nextDouble();
        double a = (v1 - v0) / t;

        System.out.println("Average acceleration = " + a);
    }
}
