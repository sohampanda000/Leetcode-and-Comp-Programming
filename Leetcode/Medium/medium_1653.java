// 1653. Minimum Deletions to Make String Balanced
public class Solution {
    public int minimumDeletions(String s) {
        int countB = 0;
        int deletions = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'b') {
                countB++;
            } else {
                if (countB > 0) {
                    deletions++;
                    countB--;
                }
            }
        }
        return deletions;
    }
}
