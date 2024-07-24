import java.util.*;
class gcdnum{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        while(a!=0&&b!=0)
        {
            if(a>b){
                a=a%b;
            }
            else{
                b=b%a;
            }
        }
        System.out.println(Math.max(a,b));


    }
}