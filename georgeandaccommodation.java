import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int c = 0;
        while (n-- > 0) {
            int p = sc.nextInt(); int q = sc.nextInt();
            if (q - p >= 2) c++;
        }
        System.out.println(c); sc.close();
    }
}
