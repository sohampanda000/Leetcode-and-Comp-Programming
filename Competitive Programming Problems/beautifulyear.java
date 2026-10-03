import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String line = sc.nextLine();
        int year = Integer.parseInt(line);
        
        while (true) {
            year++;
            if (distinct(year)) {
                System.out.println(year);
                break;
            }
        }

        sc.close();
    }

    public static boolean distinct(int n) {
        String s = Integer.toString(n);
        Set<Character> set = new HashSet<>();
        
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        
        return set.size() == s.length();
    }
}
