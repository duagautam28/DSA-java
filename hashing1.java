import java.util.Scanner;

public class hashing1{
    public static void main(String args[]){
        int a[]={1,2,3,4,5,3,2,2,3,3};
        Scanner sc=new Scanner(System.in);
       // int hashh[]=new int[13];
       int[] hashh = new int[13];
        for(int i=0;i<a.length;i++){
              hashh[a[i]]+=1; 

        }
        
        int q=sc.nextInt();
        while(q--!=0){
            int num=sc.nextInt();
            //fetch
            System.out.println(hashh[num]);
        }




    }
}
