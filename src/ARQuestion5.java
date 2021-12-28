import java.util.Scanner;

public class ARQuestion5 {

    public static void main(String[] args) {
        for (int i = 0; i <= 6; i++) {
            if (i == 3 || i == 6)
                continue;
            System.out.print(i + "\t");
        }
    }
}
