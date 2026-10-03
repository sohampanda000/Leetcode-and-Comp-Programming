// 1470. Shuffle the Array
import java.util.*;

public class Solution {
    public int[] shuffle(int[] nums, int n) {
        List<Integer> xList = new ArrayList<>();
        List<Integer> yList = new ArrayList<>();
        List<Integer> finalList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            xList.add(nums[i]);
            yList.add(nums[i + n]);
        }

        for (int j = 0; j < n; j++) {
            finalList.add(xList.get(j));
            finalList.add(yList.get(j));
        }

        int[] result = finalList.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }

}
