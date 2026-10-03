// 3158. Find the XOR of Numbers Which Appear Twice
import java.util.*;

public class Solution {
    private Map<Integer, Integer> numsMap = new HashMap<>();
    private int xorResult = 0;

    public int duplicateNumbersXOR(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            numsMap.put(num, numsMap.getOrDefault(num, 0) + 1);
        }
        return findIntFrequency();
    }
    
    public int findIntFrequency() {
        Set<Map.Entry<Integer, Integer>> entrySet = numsMap.entrySet();
        Map.Entry<Integer, Integer>[] entries = entrySet.toArray(new Map.Entry[0]);
        for (int j = 0; j < entries.length; j++) {
            Map.Entry<Integer, Integer> entry = entries[j];
            if (entry.getValue() == 2) {
                xorResult ^= entry.getKey();
            }
        }
        return xorResult;
    }
}
