class reverse {
    public static void main(String[] args) {
          int n=22074;
          int N=n;
       int c=0;
       while(n>0){
           int rem=n%10;
           if(rem==0){
            rem=1;
           }
           if(N%rem==0){
               c++;
           }
           n=n/10;
       }
        System.out.println(c);
    }
}