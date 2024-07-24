public class duplicate{
    public static void main(String args[])
    {
       int arr[]={1,2,2,3,5,4} ;
       int i=0;
       for(int j=1;j<arr.length;j++){
         if(arr[i]!=arr[j]){
            i++;
            arr[i]=arr[j];
         }
       }
       int k=i+1;
       for( i=0;i<k;i++){
        System.out.println(arr[i]);
       }

    }
}