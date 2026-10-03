// 128. Longest Consecutive Sequence
import java.util.*;

public class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        ArrayList<Integer> arr = new ArrayList<>();

        for (int num : nums) {
            arr.add(num);
        }

        Collections.sort(arr);

        int currentCounter = 1;
        int maxCounter = 1;

        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) < arr.get(i + 1) && arr.get(i) + 1 == arr.get(i + 1)) {
                currentCounter++;
            } else if (arr.get(i) < arr.get(i + 1)) {
                maxCounter = Math.max(maxCounter, currentCounter);
                currentCounter = 1;
            }
        }

        return Math.max(maxCounter, currentCounter);
    }
}
