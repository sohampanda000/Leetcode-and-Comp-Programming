// 66. Plus One
import java.math.BigInteger;

public class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder numberStr = new StringBuilder();
        for (int i = 0; i < digits.length; i++) {
            numberStr.append(digits[i]);
        }

        BigInteger number = new BigInteger(numberStr.toString());
        number = number.add(BigInteger.ONE);

        String incrementedStr = number.toString();
        int[] result = new int[incrementedStr.length()];
        
        for (int i = 0; i < incrementedStr.length(); i++) {
            result[i] = incrementedStr.charAt(i) - '0';
        }

        return result;
    }
}
