// 1684. Count the Number of Consistent Strings
public class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (String str : words) {
            boolean flag = true;
            for (char c : str.toCharArray()) {
                if (!allowed.contains(c + "")) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }
        return count;
    }
}
