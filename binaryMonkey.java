public class binaryMonkey {
    public static int calBanana(int[] a,int hour){
        int n=a.length;
       int total=0;
        for(int i=0;i<n;i++){
            total+=Math.ceil((double)(a[i])/(double)(hour));
        }
        return total;
    }

    public static int calcMax(int a[]){
        int n=a.length;
        int max=a[0];
        for(int i=0;i<n;i++){
            max=Math.max(max,a[0]);
        }
        return max;
    }

    public static int calMin(int a[],int h){
        int low=0, high=calcMax(a);
        while(low<=high){
            int mid=(low+high)/2;
            int total=calBanana(a,mid);
            if(total<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public static void main(String args[]){
        int a[] = {7, 15, 6, 3};
        int h=8;
        int ans=calMin(a,h);
        System.out.println(ans);
    }
    
}
