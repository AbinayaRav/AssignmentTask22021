import java.util.Locale;
import java.util.Scanner;

public class ARQuestion8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = "random";
        while (true) {
            System.out.println("Enter the character  :");
            ;
            if (s.toUpperCase().contains(scan.next().toUpperCase())) {
                System.out.println("FOUND");
            } else {
                System.out.println("NOT FOUND");
            }
            System.out.println("Do you wish to continue : (Y/N)");
            if (scan.next().equalsIgnoreCase("Y"))
                continue;
            else
                System.exit(0);
        }
    }


}
