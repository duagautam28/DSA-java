import java.util.*;

public class palin {
    public static boolean pal(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static boolean pal2(String s){
        Stack<Character> st=new Stack<>();
        for(char c: s.toCharArray()){
            st.push(c);
        }
        StringBuilder ss=new StringBuilder();
        while(!st.isEmpty()){
            ss.append(st.pop());
        }
        return s.equals(ss.toString());
    }

    public static void main(String args[]){
    String s="iamgian";
    boolean val=pal(s);
    if(val){
        System.out.println("yess");
    }
    else{
        System.out.println("no");
    }
    boolean val2=pal2(s);
    if(val2){
        System.out.println("yess");
    }
    else{
        System.out.println("no");
    }
}
}
