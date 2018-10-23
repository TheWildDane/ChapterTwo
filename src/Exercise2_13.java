import java.util.Scanner;

public class Exercise2_13 {

    public static void main(String[] args) {

        //Write  a  program  that  prompts  the  user  to  enter  a  monthly  saving  amount
        //  and  displays the account value after the sixth month.

        Scanner Input = new Scanner(System.in);
        System.out.println("Please, input deposit");

        double deposit = Input.nextDouble();
        double annualInterestRate = 0.0375;
        double monthlyInterestRate = annualInterestRate/12;


        double month1 = deposit * (1 + monthlyInterestRate);
        System.out.println(" first month, account value: " + month1 + "$");
        double month2 = (100 + month1) * (1 + monthlyInterestRate);
        System.out.println(" second month, account value: " + month2 + "$");
        double month3 = (100 + month2) * (1 + monthlyInterestRate);
        System.out.println(" third month, account value: " + month3 + "$");
        double month4 = (100 + month3) * (1 + monthlyInterestRate);
        System.out.println(" fourth month, account value: " + month4 + "$");
        double month5 = (100 + month4) * (1 + monthlyInterestRate);
        System.out.println(" fifth month, account value: " + month5 + "$");
        double month6 = (100 + month5) * (1 + monthlyInterestRate);
        System.out.println(" sixth month, account value: " + month6 + "$");

    }
}
