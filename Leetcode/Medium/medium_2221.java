// 2221. Find Triangular Sum of an Array
public class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        } else {
            return elementPresent(nums, n);
        }
    }

    private int elementPresent(int[] nums, int n) {
        if (n == 1) return nums[0];
        int[] newNums = new int[n - 1];
        for (int i = 0; i < newNums.length; ++i) {
            newNums[i] = (nums[i] + nums[i + 1]) % 10;
        }
        if (nums.length == newNums.length) {
            for (int j = 0; j < nums.length; ++j) {
                nums[j] = newNums[j];
            }
        }
        return elementPresent(newNums, newNums.length);
    }
}
