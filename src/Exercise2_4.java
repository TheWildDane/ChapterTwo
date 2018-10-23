import java.util.Scanner;

public class Exercise2_4 {
    // (Convert square meter into ping) Write a program that converts square meter into ping.
    // The program prompts the user to enter a number in square meter, converts it to ping, and displays the result.
    // One square meter is 0.3025 ping.



    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Please, Enter Number of Square Meters");
        double squareMeter = Input.nextDouble();
        double ping = 0.3025;
        double SQUARE_METERS_TO_PING = squareMeter * ping;
        System.out.println("Ping = " + SQUARE_METERS_TO_PING);
    }
}
