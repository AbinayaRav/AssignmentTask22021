import java.util.Scanner;

public class ARQuestion7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the floating point number :");
        double num = scan.nextDouble();
        if(num==0)
        {
            System.out.print("ZERO ");
        }
        else if(num>0)
        {
            System.out.print("POSITIVE ");
        }
        else
        {
            System.out.print("NEGATIVE ");
        }
        if(Math.abs(num)<1)
            System.out.println("SMALL");
        else if(Math.abs(num)>1000000)
            System.out.println("LARGE");
    }
}
