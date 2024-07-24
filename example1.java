// using brute force

import java.util.*;
public class example1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num1,num2,n;
        num1=0;
        num2=0;

        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%3!=0)
            {
                num1=num1+i;
            }
            else{
                num2=num2+i;
            }
        }
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num1-num2);
    }
    
}
