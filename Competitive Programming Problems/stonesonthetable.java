import java.util.*;

@SuppressWarnings("unused")
public class Main {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();

        String[] colors = sc.nextLine().split("");
        int takes = 0;

        for (int i = 0; i < colors.length - 1; i++) {
            if (colors[i].equals(colors[i + 1])) {
                takes++;
            }
        }

        System.out.println(takes);
        sc.close();
    }
}
