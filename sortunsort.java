public class sortunsort {
    public static void main(String args[]){
        int a[]={1,2,3,4,5};
        int n=5;
        boolean s=true;
        for(int i=1;i<n;i++){
            if(a[i]<a[i-1])
            {
                 s= false;
                break;
            }
        }
        if(s==false){
            System.out.println("unsorted");
        }
        else{
            System.out.println("sorted");
        }

    }
}
