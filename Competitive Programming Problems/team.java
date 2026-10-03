import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int decision = 0;
        int count = 0;
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String[] views = sc.nextLine().split(" ");
            for (int j = 0; j < views.length; j++) {
                if (views[j].equals("1")) {
                    decision++;
                }
            }
            if (decision >= 2) {
                count++;
            }
            decision = 0;
        }
        System.out.print(count);
    }
}
