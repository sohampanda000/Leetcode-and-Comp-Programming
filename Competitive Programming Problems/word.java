import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lower = 0; int upper = 0;
        String line = sc.nextLine();

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    upper++;
                } else if (Character.isLowerCase(c)) {
                    lower++;
                }
            }
        }

        System.out.println(determine(line, lower, upper));
        sc.close();
    }

    private static String determine(String s, int a, int b) {
        if (a >= b) {
            return s.toLowerCase();
        } else if (a < b) {
            return s.toUpperCase();
        } else {
            return s;
        }
    }
}
