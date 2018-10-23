import java.util.Scanner;

public class Exercise2_5 {
    public static void main(String[] args) {
        //(Financial  application:  calculate  tips)
        //  Write  a  program  that  reads  the  subtotal  and  the  gratuity  rate,
        //  then  computes  the  gratuity  and  total.  For  example,
        //  if  the  user enters 10 for subtotal and 12% for gratuity rate,
        // the program displays $1.2as gratuity and $11.2 as total.

        Scanner Input = new Scanner(System.in);

        System.out.println("Please input the subtotal and the gratuity rate");
        double subtotal = Input.nextDouble();
        double gratuityRate = Input.nextDouble();
        double gratuity = subtotal * (gratuityRate / 100);
        double total = subtotal + gratuity;

        System.out.println("the gratuity is $" + gratuity +
                " and total is $" + total);
    }
}
