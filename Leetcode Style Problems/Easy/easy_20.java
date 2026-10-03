// 20. Valid Parentheses
import java.util.*;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> dsa = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                dsa.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (dsa.isEmpty()) {
                    return false;
                }
                char top = dsa.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return dsa.isEmpty();
    }
}
