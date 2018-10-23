import java.util.Scanner;

public class Exercise2_12 {

    public static void main(String[] args) {

        // (Compute  arithmetic  progression)  An  arithmetic  progression  (AP)  or  arithmetic  sequence
        // is a sequence of numbers such that the difference between the consecutive terms is constant.
        // For instance, the sequence 5, 7, 9, 11, 13, 15... is an AP with a common difference of 2.
        // If the initial term of an AP is a1 and the common difference of successive members is d,
        // then the nth term of the sequence an is given by:

        Scanner Input = new Scanner(System.in);
        System.out.println("Enter speed: ");

       double speed = Input.nextDouble();
        System.out.println("Enter acceleration: ");
       double acceleration = Input.nextDouble();

       double length = Math.pow(speed, 2) / (2 * acceleration);

        System.out.println("The minimum runway length for this airplane is " +
                length);

    }
}
