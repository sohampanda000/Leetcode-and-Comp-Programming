import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int moves = 5; int steps = 0;
        int point = sc.nextInt();

        while (point > 0) {
            if (point - moves < 0) {
                moves--;
            } else {
                point -= moves;
                steps++;
            }
        }

        System.out.println(steps);
        sc.close();
    }
}
