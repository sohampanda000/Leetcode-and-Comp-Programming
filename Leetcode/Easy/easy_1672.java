// 1672. Richest Customer Wealth
import java.util.*;

public class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int customerWealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                customerWealth += accounts[i][j];
            }
            if (customerWealth > maxWealth) {
                maxWealth = customerWealth;
            }
        }
        return maxWealth;
    }
}
