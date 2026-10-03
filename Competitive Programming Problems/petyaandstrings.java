import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); int lex = 0;
        String L1 = sc.nextLine();
        String L2 = sc.nextLine();
        
        if (L1.length() == L2.length()) {
            for (int i = 0; i < L1.length(); i++) {
                if (check(L1, i) != check(L2, i)) {
                    if (check(L1, i) > check(L2, i)) {
                        lex += 1; break;
                    } else if (check(L1, i) < check(L2, i)) {
                        lex -= 1; break;
                    }
                }
            }
        }

        System.out.print(lex); sc.close();
    }

    private static char check(String s, int n) {
        return Character.toLowerCase(s.charAt(n));
    }
}
