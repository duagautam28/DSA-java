import java.util.Scanner;

public class hashingalpha{
    public static void main(String args[]){
        String s="abacdsrf";
        Scanner sc=new Scanner(System.in);
       // int hashh[]=new int[13];
       int[] hashh = new int[26];
        for(int i=0;i<s.length();i++){
              hashh[s.charAt(i)-'a']+=1; 

        }
        
        int q=sc.nextInt();
        while(q--!=0){
            char c=sc.next().charAt(0);
            //fetch
            System.out.println(hashh[c-'a']);
        }




    }
}
