import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nums = sc.nextLine().split(" ");
        
        int n = Integer.parseInt(nums[0]);
        int k = Integer.parseInt(nums[1]);
        
        int adv = 0;
        
        String[] strScores = sc.nextLine().split(" ");
        int[] intScores = new int[strScores.length];
        
        for (int i = 0; i < strScores.length; i++) {
            intScores[i] = Integer.parseInt(strScores[i]);
        }
        for (int j = 0; j < intScores.length; j++) {
            if (intScores[j] > 0 && intScores[j] >= intScores[k - 1]) {
                adv++;
            }
        }
        
        System.out.print(adv);
    }
}
