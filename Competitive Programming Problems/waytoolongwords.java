import java.util.*;
 
public class Main {
    public static void main(String[] args) throws InputMismatchException {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int i = 0;
        sc.nextLine();
        while (sc.hasNext() && i < n) {
            String word = sc.nextLine();
            if (word.length() > 10) {
                char first = word.charAt(0);
                char last = word.charAt(word.length() - 1);
                int middle = word.length() - 2;
                sb.append(first);
                sb.append(middle);
                sb.append(last);
                System.out.println(sb.toString());
                sb.setLength(0);
            } else {
                System.out.println(word);
            }
            ++i;
        }
        sc.close();
    }
}
