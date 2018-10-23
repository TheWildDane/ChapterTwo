import java.util.Scanner;

public class Exercise2_15 {

    public static void main(String[] args) {

        // Geometry: distance of two points) Write a program that prompts the user to enter two points
        // (x1, y1) and (x2, y2) and displays their distance between them.
        // The formula for computing the distance is square root(x2-x1)2+(y2-y1)2.
        // Note that you can use Math.pow(a, 0.5) to compute square root a

        Scanner Input = new Scanner(System.in);

        System.out.println("please, enter x1 and y1");

        double x1 = Input.nextDouble();
        double y1 = Input.nextDouble();

        System.out.println("Please, enter x2 and y2");
        double x2 = Input.nextDouble();
        double y2 = Input.nextDouble();

        double distance = Math.pow(Math.pow(x2 - x1, 2) +
                Math.pow(y2 - y1,2), 0.5);

        System.out.println("the distance between the two points is: " + distance);

    }
}
