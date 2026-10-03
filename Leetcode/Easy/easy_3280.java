// 3280. Convert Date to Binary
public class Solution {
    public String convertDateToBinary(String date) {
        String[] arr = date.split("-");
        StringBuilder binStr = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            String binary = Integer.toBinaryString(Integer.parseInt(arr[i]));
            binStr.append(binary);
            if (i < arr.length - 1) {
                binStr.append("-");
            }
        }

        return binStr.toString();
    }
}
