import java.util.Scanner;

public class ARQuestion6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number :");
        double num = scan.nextDouble();
        if (num % 2 != 0)
            System.out.println("NEW");
        else {
            if ((num >= 2) && (num <= 5)) {
                System.out.println("OLD");
            } else if ((num >= 6) && (num <= 30)) {
                System.out.println("NEW");
            } else if (num > 30)
                System.out.println("OLD");
        }

    }
}
