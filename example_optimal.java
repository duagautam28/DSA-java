import java.util.*;

public class example_optimal {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n =sc.nextInt();
        System.out.println("Enter multiple");
        int m=sc.nextInt();
        int num1=((n/m)*(2*m+(n/m)-1)*m)/2;
        System.out.println(num1);
        int num2=(n/2)*(2+(n-1)*1);
        System.out.println(num2);
        System.out.println(num2-num1);


    }
}
