import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); int c = 0;
        String[] line = sc.nextLine().split("");

        for (int i = 0; i < line.length; i++) {
            int n = Integer.parseInt(line[i]);
            if (n == 4 || n == 7) {
                c++;
            }
        }

        if (c == 4 || c == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        sc.close();
    }
}
