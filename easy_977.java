// 977. Squares of a Sorted Array
import java.util.Arrays;

public class Solution {
    public int[] sortedSquares(int[] nums) {
        int current = 1; int len = nums.length;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = nums[i] * nums[i];
        }
        Arrays.sort(arr);
        return arr;
    }
}
