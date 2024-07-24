class Solution {
    public static void main(String args[]){
        long rev=0;
        long x=1534236469;
        long n=x;
        if(x<0){
             n=-1*x;
        }
        while(n!=0){
            long rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(x>0){
            System.out.println(rev);
        }
        else{
            System.out.println(-1*rev);
        }

    }
}