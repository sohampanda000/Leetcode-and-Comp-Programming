// 1165. Single-Row Keyboard
public class Solution {
    public int calculateTime(String keyboard, String word) {
        int curr = 0;
        int prev = 0;
        int total = 0;
        for (char c : word.toCharArray()) {
            prev = curr;
            curr = keyboard.indexOf(c);
            total += Math.abs(curr - prev);
        }
        return total;
    }
}
