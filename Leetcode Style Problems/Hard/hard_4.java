// 4. Median of Two Sorted Arrays
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    private double median;

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Double> doubleArrayList = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            doubleArrayList.add((double) nums1[i]);
        }
        for (int j = 0; j < nums2.length; j++) {
            doubleArrayList.add((double) nums2[j]);
        }
        
        Collections.sort(doubleArrayList);
        int size = doubleArrayList.size();
        
        if (size % 2 == 0) {
            median = (doubleArrayList.get(size / 2 - 1) +
            doubleArrayList.get(size / 2)) / 2;
        } else {
            median = doubleArrayList.get(size / 2);
        }
        return median;
    }
}
