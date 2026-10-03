import java.util.*;

public class Solution {
    public String largestNumber(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            arr.add(0);
        }

        for (int j = 0; j < nums.length; j++) {
            arr.set(j, nums[j]);
        }

        ArrayList<String> strArr = new ArrayList<>();
        for (Integer num : arr) {
            strArr.add(String.valueOf(num));
        } //

        Collections.sort(strArr, (a, b) -> (b + a).compareTo(a + b));

        if (strArr.get(0).equals("0")) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        for (String str : strArr) {
            result.append(str);
        }

        return result.toString();
    }
}
