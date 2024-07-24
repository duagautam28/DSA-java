public class longsetsum {
    public static  void main(String args[])
    {
        int arr[]={2,3,4,5,2,3,5,2,4};
        int k=11;
        int len=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                    sum=sum+arr[j];
                    if(sum==k){
                        len=Math.max(len,j-i+1);
                    }
            }
        }
        System.out.println(len);

    }
}
