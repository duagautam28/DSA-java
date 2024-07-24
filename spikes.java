import java.util.*;
public class spikes{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("no of elements");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter spikes");
        int k=sc.nextInt();
        for(int i=0;i<n;i++){
            a[i]=a[i]>>k;

            System.out.println(a[i]);
        }
       
    }
}