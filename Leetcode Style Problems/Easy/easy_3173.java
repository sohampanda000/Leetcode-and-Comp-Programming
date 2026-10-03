// 3173. Bitwise OR of Adjacent Elements
public class Solution {
    public int[] orArray(int[] nums) {
        int n = nums.length - 1;
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = nums[i] | nums[i + 1];
        }
        return answer;
    }
}
