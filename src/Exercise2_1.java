import java.util.Scanner;

public class Exercise2_1
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please enter miles");

        double miles = input.nextDouble();
        double KILOMETERS_PER_MILES = 1.6;
        double kilometers = miles * KILOMETERS_PER_MILES;

        System.out.println("Kilometers = " + kilometers);




    }
}
