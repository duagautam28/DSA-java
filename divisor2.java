import java.util.Scanner;
public class divisor2 {
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        // int b=sc.nextInt();
        for(int i=1;i<=Math.sqrt(a);i++){
            if(a%i==0)
            {
                System.out.println(i);
                if(i!=a/i){
                    System.out.println(a/i);
                }
            }
        }

    }
}

    
