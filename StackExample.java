import java.util.*;

public class StackExample {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char t : s.toCharArray()) {
            if (t == '(' || t == '[' || t == '{') {
                st.push(t);
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                char ch = st.pop();
                if (t == ')' && ch == '(' || t == ']' && ch == '[' || t == '}' && ch == '{') {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String args[]) {
        String s = "{[()]}";
        boolean val = isValid(s);
        if (val) {
            System.out.println("Valid parentheses");
        } else {
            System.out.println("Invalid parentheses");
        }
    }
}
