import java.util.*;
class solution{
     int newPairs(int[] nums){
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int num:nums)
        {
            if(map.containsKey(num)){
                map.put(num,(map.get(num))+1);
            }
            else{
                map.put(num,1);
            }
        }
        int goodpairs=0;
        for(Map.Entry<Integer,Integer>e:map.entrySet()) {
          goodpairs=(e.getValue()*(e.getValue()-1))/2;   
          return goodpairs;
        }
        return goodpairs;
    } 
}
public class goodpairs2{
    public static void main(String [] args){
        solution sol=new solution();
        int arr[]={1,1,2,4,2,4,3};
       int good= sol.newPairs(arr);
       System.out.println(good);
    }
}