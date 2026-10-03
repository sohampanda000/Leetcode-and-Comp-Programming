import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();

        String[] line = sc.nextLine().split("");
        int a = 0; int d = 0;

        for (int i = 0; i < n; i++) {
            if (line[i].equals("A")) {
                a++;
            } else {
                d++;
            }
        }

        System.out.println(determine(a, d));
        sc.close();
    }

    private static String determine(int x, int y) {
        if (x > y) {
            return "Anton";
        } else if (x < y) {
            return "Danik";
        } else {
            return "Friendship";
        }
    }
}
