import java.util.Scanner;

public class Exercise2_11 {

    public static void main(String[] args) {

    // (Population projection) Rewrite Programming Exercise 1.11 to prompt the user to enter the number of years
        // and displays the population after the number of years.
        // Use  the  hint  in  Programming  Exercise  1.11  for  this  program.
        //  The  population  should be cast into an integer.

        Scanner Input = new Scanner(System.in);

        System.out.println("Enter the number of years");
        int years = Input.nextInt();





        int population = 312032486 + (((312032486 / 7)
                - (312032486 / 13)
                + (312032486 / 45))* years);

        System.out.println("The population in " + years + " is " + population);


    }
}
