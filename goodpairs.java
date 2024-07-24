import java.util.*;
public class goodpairs {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int nums[]=new int[4];
    // ArrayList<Integer> al= new ArrayList<Integer>();

    int c=0;
    for(int i=0;i<4;i++){
        nums[i]=sc.nextInt();
    }
    for(int i=0;i<4;i++){
        for(int j=i+1;j<4;j++)
        {
            if(nums[i]==nums[j] && i<j){
                c++;
            }
        }
    }
    System.out.println(c);
}
}
