import java.util.Scanner;



public class Excercise2_6 {

    //Multiply the digits in an integer)
    // Write a program that reads an integer between 0 and 1000 and  multiplies all the digits in the integer.
    // For example, if an integer is 932, the multiplication of all its digits is 54.
    // Hint: Use the % operator to extract digits,
    // and use the / operator to remove the extracted digit.
    // For instance, 932 % 10 = 2 and 932 / 10 = 93.

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int n,mul=1;
        System.out.println("Please, Enter a Digit Between 0 and 1000");
        n=Input.nextInt();

        while (n!=0)
        {
            mul = mul * (n % 10);
            n = n / 10;
        }

        System.out.println("New Number Is " + mul);

    }
}
