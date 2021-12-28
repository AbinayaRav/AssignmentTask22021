public class ARQuestion3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20 ;
        int c = 1;
        double avg = (double)(a+b+c)/3;
        System.out.println("Average is "+avg);
        if(avg>a && avg>b && avg >c)
        {
            System.out.println("Average is higher than a, b ,c ");
        }
        else if((avg>a)&&(avg>b))
        {
            System.out.println("Average is higher than a and b");
        }
        else if((avg>b)&&(avg>c))
        {
            System.out.println("Average is higher than b and c");
        }
        else if((avg>a)&&(avg>c))
        {
            System.out.println("Average is higher than a and c");
        }
        else if(avg>a)
        {
            System.out.println("Average is greater than a");
        }
        else if(avg>b)
        {
            System.out.println("Average is greater than b");
        }
        else if(avg>c) {
            System.out.println("Average is greater than c");
        }
    }
}
