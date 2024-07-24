import java.util.*;
public class frequency {
    public static void main(String args[])
    {
       
        int a[]={1,1,1,2,3,4,3,2,4,5,};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num :a){
            if(map.containsKey(num)){
                map.put(num,(map.get(num))+1);
            }
            else{
                map.put(num,1);
            }
        }
        int max_freq=-1;
        int min_freq=9999;
        int max_elem=0,min_elem=0;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            int count=entry.getValue();
            int element=entry.getKey();
            if(count>max_freq){
                max_elem=element;
                max_freq=count;
            }
            if(count<min_freq){
                min_elem=element;
                min_freq=count;
            }
        }
        System.out.println("max frequency= "+max_freq+ " element= "+max_elem);
        System.out.println("min frequency= "+min_freq+ " element= "+min_elem);
    }
}
