// 2114. Maximum Number of Words Found in Sentences
import java.util.*;

public class Solution {
    public int mostWordsFound(String[] sentences) {
        int number = 0;
        ArrayList<Integer> counts = new ArrayList<Integer>();

        for (int i = 0; i < sentences.length; i++) {
            counts.add(0);
        }

        for (int j = 0; j < sentences.length; j++) {
            String[] words = sentences[j].split(" ");
            for (String word : words) {
                number++;
            }
            counts.set(j, number);
            number = 0;
        }

        return Collections.max(counts);
    }
}
