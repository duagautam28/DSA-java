import java.util.*;
public class monkey {
    public static int calBanana(int[] a,int hour){
        int n=a.length;
       int total=0;
        for(int i=0;i<n;i++){
            total+=Math.ceil((double)(a[i])/(double)(hour));
        }
        return total;
    }

    public static int calcMax(int a[]){
        int n=a.length;
        int max=a[0];
        for(int i=0;i<n;i++){
            max=Math.max(max,a[0]);
        }
        return max;
    }
    
    public static int calcminHours(int[] a,int h){
        int max=calcMax(a);
        for(int i=0;i<max;i++){
            int minHour=calBanana(a,i);
            if(minHour<=h){
                return i;
            }
        }
        return 0;
    }
    public static void main(String args[])
    {
        int a[] = {7, 15, 6, 3};
         int h=8;
         int ans=calcminHours(a,h);
         System.out.println(ans);

    }
   
}
