// 1773. Count Items Matching a Rule
public class Solution {
    public int countMatches(List<List<String>> items, String key, String e) {
        int count = 0;
        for (int i = 0; i < items.size(); i++){
                if (key.equals("type")) {
                    if (items.get(i).get(0).equals(e)) {
                        count++;
                    }
                }
               else if (key.equals("color")){
                    if (items.get(i).get(1).equals(e)) {
                        count++;
                    }
                }
                else {
                    if (items.get(i).get(2).equals(e)) {
                        count++;
                    }
                }
            }
        return count;
    }
}
