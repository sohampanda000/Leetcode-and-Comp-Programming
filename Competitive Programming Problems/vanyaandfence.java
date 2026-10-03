import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); int b = 0;
        String[] l = sc.nextLine().split(" ");
        String[] a = sc.nextLine().split(" ");

        int n = Integer.parseInt(l[0]);
        int h = Integer.parseInt(l[1]);

        for (int j = 0; j < n; j++) {
            if (Integer.parseInt(a[j]) <= h) {
                b += 1;
            } else {
                b += 2;
            }
        }

        System.out.println(b);
        sc.close();
    }
}
