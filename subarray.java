public class subarray {
    public static void main(String args[]){
        int a[]={2,3,5,1,9};
        int n=a.length;
        int k=10;
        int len=0;
        int right=0;
        int left=0;
        int sum=a[0];
        while(right<n)
        {
            
            while (left<=right && sum>k) {
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
        System.out.println(len);
    }
}
