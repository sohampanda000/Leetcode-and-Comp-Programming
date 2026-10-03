// 9. Palindrome Number
public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        
        String str = Integer.toString(x);
        String reversedStr = new StringBuilder(str).reverse().toString();
        
        return str.equals(reversedStr);
    }https://github.com/cozyat/Leetcode-and-Comp-Programming/tree/main
}
