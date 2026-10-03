// 3264. Final Array State After K Multiplication Operations I
public class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for (int j = 0; j < k; j++) {
            int minIndex = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < nums[minIndex]) {
                    minIndex = i;
                }
            }
            nums[minIndex] *= multiplier;
        }
        return nums;
    }
}
