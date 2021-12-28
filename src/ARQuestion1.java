import java.util.Scanner;

public class ARQuestion1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Please enter the number to check for divisibility :");
            int num = scan.nextInt();
            if (num % 3 == 0)
                System.out.println("ConsultAdd");
            else if (num % 5 == 0)
                System.out.println("Java Training");
            else if (num % 3 == 0 && num % 5 == 0)
                System.out.println("ConsultAdd Java Training");
            else
                System.out.println("The number is neither divisible by 3 nor 5");
            System.out.println("Do you want to try again? Enter (Y/N)");
            String s = scan.next();
            if (s.equalsIgnoreCase("Y"))
                continue;
            else
                System.exit(0);
        }

    }
}
