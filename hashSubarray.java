import java.util.HashMap;

public class hashSubarray {
    public static int maxSub(int a[],int k){
        HashMap<Integer,Integer>map=new HashMap<>();
        int maxlen=0;
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            if(sum==k){
                maxlen=Math.max(maxlen,i+1);
            }
            int rem=sum-k;
            if(map.containsKey(rem)){
                int len=i-map.get(rem);
                maxlen=Math.max(maxlen,len);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return maxlen;
    }
    public static void main(String args[]){
        int a[]={2,3,4,5,1,4,3};
        int k=3;
        int ans=maxSub(a,k);
        System.out.println(ans);


    }
}