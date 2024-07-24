import java.util.*;

public class palindrome {
   // (double pointer method)
    // this method is having time complexity of O(n) and space complexity of O(1) 
    public static boolean isPalindrome(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(right)!=s.charAt(left)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    } 
    // stack method  
    // this method is having time complexity of O(n) and space complexity of O(n)
    public static boolean stPalindrome(String s){
        Stack<Character>st=new Stack<>();
        for(char c: s.toCharArray()){
            st.push(c);
        }
        StringBuilder revString=new StringBuilder();
        while(!st.isEmpty()){
          revString.append(st.pop());
        }
        return s.equals(revString.toString()); // here toSTring converting StringBuilder to string

    }

    public static void main(String args[]){
        String s="amanaplanacanalpanama";
        boolean val= isPalindrome(s);
        boolean val_st= stPalindrome(s);
        if(val){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
        if(val_st){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}
