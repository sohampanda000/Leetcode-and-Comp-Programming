import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");

        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);

        int years = 0;
        while (a <= b) {
            a *= 3;
            b *= 2;
            years++;
        }
        
        System.out.println(years);
        sc.close();
    }
}
