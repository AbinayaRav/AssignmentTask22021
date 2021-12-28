import java.util.Scanner;

public class ARQuestion4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the number : ");
            if (scan.nextDouble() < 0) {
                System.out.println("Game over");
                System.exit(0);
            } else {
                System.out.println("Keep going");
            }
        }
    }
}
