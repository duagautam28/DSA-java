public class fibo {
 public static void main(String args[]){
    int i;
    int n=5;
    for( i=0;i<n;i++){
         int a= fib(i);
         System.out.println(a);

    }
 }
 public static int fib(int n){
    if(n==0){
        return 0;
    }
    else if(n==1){
        return 1;
    }
    else{
       return fib(n-1)+fib(n-2);
    }
 }
}
