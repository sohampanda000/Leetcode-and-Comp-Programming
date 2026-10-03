import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); int b = 0;
        String[] line = sc.nextLine().split(" ");

        int k = Integer.parseInt(line[0]);
        int n = Integer.parseInt(line[1]);
        int w = Integer.parseInt(line[2]);

        for (int i = 1; i <= w; i++) {
            n -= i * k; b = Math.max(0, -n);
        }

        System.out.println(b);
        sc.close();
    }
}
