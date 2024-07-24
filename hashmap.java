import java.util.Scanner;

import javax.swing.RowFilter.Entry;

import java.util.*;

public class hashmap {
    public static void main(String args[]){
        int a[]={1,2,34,2,4,23,4,3,3};
        Scanner sc=new Scanner(System.in);
        
        //precompute
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(map.containsKey(a[i])){
                map.put(a[i],(map.get(a[i])+1));

            }
            else{
                map.put(a[i],1);
            }
        }
        for(Map.Entry<Integer,Integer>it:map.entrySet()){
            System.out.println(it.getKey()+"->"+it.getValue());
        }



        int q=sc.nextInt();
        while(q-->0)
        {
            int n=sc.nextInt();
            if(map.containsKey(n)){
                System.out.println(map.get(n));
            }
            else{
                System.out.println(0);
            }
           
            //fetch
        }
    }
}
