import java.util.Scanner;

public class Exercise2_7 {

    public static void main(String[] args) {
        // (Find  the  number  of  years)
        // Write  a  program  that  prompts  the  user  to  enter  the  minutes (e.g., 1 billion),
        // and displays the number of years and days for the min-utes.
        // For simplicity, assume a year has 365 days.
        Scanner Input = new Scanner(System.in);

        System.out.println("Please, Enter Number of Minutes");

        int minutes = Input.nextInt();
        int years = minutes / 525600;
        int days = (minutes % 525600) / 1440;
        // 1440 minutes in a day
        // 525600 minutes in a year

        System.out.println(minutes + " minutes is approximately " + years
                + " years and " + days + " days");



    }
}
