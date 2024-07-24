//brute force
import java.util.*;
public class divisor {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        // int b=sc.nextInt();
        for(int i=1;i<=a;i++){
            if(a%i==0)
            {
                System.out.println(i);
            }
        }

    }
}
