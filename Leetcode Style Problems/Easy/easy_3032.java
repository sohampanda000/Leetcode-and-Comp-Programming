// 3032. Count Numbers With Unique Digits II
public class Solution {
    public int numberCount(int a, int b) {
        List<Integer> fullRange = new ArrayList<>();
        int counter = 0;

        for (int i = a; i <= b; i++) {
            fullRange.add(i);
        }

        for (int j = 0; j < fullRange.size(); j++) {
            String numStr = String.valueOf(fullRange.get(j));
            Set<Character> uniqueDigits = new HashSet<>();
            boolean hasDuplicate = false;

            for (int k = 0; k < numStr.length(); k++) {
                if (!uniqueDigits.add(numStr.charAt(k))) {
                    hasDuplicate = true;
                    break;
                }
            }

            if (!hasDuplicate) {
                counter++;
            }
        }

        return counter;
    }
}
