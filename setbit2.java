public class setbit2 {
    public static void main(String args[])
    {
        int a[]={5,10,1,5,2};
        int k=1;
        int sum=0,count=0;
        for(int i=0;i<5;i++)
        {
            count=0;
            int j=i;
            while(j>0)
            {
                j&=(j-1);
                count++;
            }
            if(count==k){
                sum=sum+a[i];
            }
        }
        System.out.println(sum);

    }
}
