// 3190. Find Minimum Operations to Make All Elements Divisible by Three
public class Solution {
    public int minimumOperations(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            arr.add(nums[i]);
        }

        for (int j = 0; j < arr.size(); j++) {
            if (arr.get(j) % 3 != 0) {
                count++;
            }
        }
        return count;
    }
}
