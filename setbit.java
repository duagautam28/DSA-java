public class setbit {
    public static void main(String args[]){ 
        int count=0;
        int n=3;
        while(n>0){
            // count+=n&1;
            // n=n>>1;
            // or
            n&=(n-1);
            count++;
        }
    
    System.out.println(count);
    }
}
