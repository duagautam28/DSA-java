import java.util.HashMap;

public class hashSubarry2 {
    
    public static int maxSub1(int a[],int k){
        int sum=a[0];
        int left=0;
        int right=0;
        int len=0;
        int n=a.length-1;
        while(right<n){
            while(left<=right&&sum>k){
                sum-=a[left];
                left++;
            }
            if(sum==k){
                len=Math.max(len,right-left+1);
            }
            right++;
            if(right<n){
                sum+=a[right];
            }
        }
        return len;
    }

    public static int maxSub2(int a[],int k){
        int maxLen=0;
        int sum=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<a.length;i++){
        sum+=a[i];
        if(sum==k){
            maxLen=Math.max(maxLen,i+1);
        }
        int rem=sum-k;
        if(map.containsKey(rem)){
            int len=i-map.get(rem);
            maxLen=Math.max(maxLen, len);
        }
        if(!map.containsKey(sum)){
            map.put(sum,i);
        }
        }
        return maxLen;
    }
    
    
    public static void main(String args[]){
        int a[]={2,3,4,5,1,4,3};
        int k=3;
        int val1=maxSub1(a,k);
        int val2=maxSub2(a,k);
        System.out.println(val1);
        System.out.println(val2);

    }

}
