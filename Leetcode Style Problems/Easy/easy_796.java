// 796. Rotate String
public class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        
        StringBuffer sb = new StringBuffer(s);
      
        for (int i = 0; i < s.length(); i++) {
            char firstChar = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(firstChar);
            
            if (sb.toString().equals(goal)) {
                return true;
            }
        }
        return false;
    }
}
