import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().chars().distinct().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
        if (line.length() % 2 != 0) {
            System.out.print("IGNORE HIM!");
        } else {
            System.out.print("CHAT WITH HER!");
        }
        sc.close();
    }
}
