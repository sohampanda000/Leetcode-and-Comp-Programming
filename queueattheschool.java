import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int t = sc.nextInt(); sc.nextLine(); 
        char[] q = sc.nextLine().toCharArray();
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (q[j] == 'B' && q[j + 1] == 'G') {
                    char temp = q[j]; q[j] = q[j + 1]; q[j + 1] = temp; j++;
                }
            }
        }
        System.out.println(new String(q)); sc.close();
    }
}
