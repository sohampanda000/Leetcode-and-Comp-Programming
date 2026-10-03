// 1460. Make Two Arrays Equal by Reversing Subarrays
import java.util.*;

public class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        ArrayList<Integer> targetList = new ArrayList<Integer>();
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        for (int i = 0; i < target.length; i++) {
            targetList.add(target[i]);
        }

        for (int j = 0; j < arr.length; j++) {
            arrList.add(arr[j]);
        }

        Collections.sort(targetList);
        Collections.sort(arrList);
        
        return targetList.equals(arrList);
    }
}
        // Alternative Solution down below (3 lines)
        // Arrays.sort(target);
        // Arrays.sort(arr);
        // return Arrays.equals(target, arr);
