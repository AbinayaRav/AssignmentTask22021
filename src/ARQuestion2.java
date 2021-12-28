import java.util.Scanner;

public class ARQuestion2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        double result = 0;
        while (flag) {
            System.out.println("Please select an option :\n1. Addition \n2. Subtraction \n3. Multiplication \n4. Division \n5. Average");
            int choice = scan.nextInt();
            System.out.println("Please enter the first number : ");
            double first = scan.nextDouble();
            System.out.println("Please enter the second number :");
            double second = scan.nextDouble();
            switch (choice) {
                case 1:
                    result = (first + second);
                    System.out.println("The addition of " + first + " and " + second + " = " + result);
                    break;
                case 2:
                    result = (first - second);
                    System.out.println("The subtraction of " + first + " and " + second + " = " + result);
                    break;
                case 3:
                    result = (first * second);
                    System.out.println("The multiplication of " + first + " and " + second + " = " + result);
                    break;
                case 4:
                    result = (first / second);
                    System.out.println("The division of " + first + " and " + second + " = " + result);
                    break;
                case 5:
                    System.out.println("Please enter the third number : ");
                    double first1 = scan.nextDouble();
                    System.out.println("Please enter the fourth number :");
                    double second1 = scan.nextDouble();
                    result = (double)(first + second + first1 + second1) / 4;
                    System.out.println("The average of the four numbers is : " + result);
                    break;
            }
            if (result < 0)
                System.out.println("“Oops option " + choice + " is returning the negative number”");
            System.out.println("Do you want to try again? Enter (Y/N)");
            String s = scan.next();
            if (s.equalsIgnoreCase("Y"))
                continue;
            else
                System.exit(0);
        }
    }
}
