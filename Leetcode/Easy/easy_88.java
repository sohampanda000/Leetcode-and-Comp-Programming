// 88. Merge Sorted Array
import java.util.*;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> sortedNums1 = sort(Arrays.copyOf(nums1, m));
        ArrayList<Integer> sortedNums2 = sort(Arrays.copyOf(nums2, n));

        sortedNums1.addAll(sortedNums2);
        Collections.sort(sortedNums1);

        for (int i = 0; i < sortedNums1.size(); i++) {
            nums1[i] = sortedNums1.get(i);
        }
        
        System.out.println(sortedNums1);
    }

    public ArrayList<Integer> sort(int[] list) {
        ArrayList<Integer> mutable = new ArrayList<>();
        for (int num : list) {  
            mutable.add(num);
        }
        Collections.sort(mutable);
        return mutable;
    }
}
