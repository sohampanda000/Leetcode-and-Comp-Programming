import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        while (n-- > 0) {
            String line = sc.next();
            int[] row = new int[line.length()]; int counter = 0;
            int a = 1; int b = 2; int c = 3; int[] match = new int[]{a, b, c};
            for (int i = 0; i < line.length(); i++) row[i] = line.charAt(i) - 'a' + 1;
            for (int j = 0; j < row.length; j++) {
                if (match[j] != row[j]) {
                    int temp = row[j]; row[j] = match[j]; match[j] = temp; counter++;
                }
            }
            if (counter > 2) System.out.println("NO");
            else System.out.println("YES");
        }
        sc.close();
    }
}
