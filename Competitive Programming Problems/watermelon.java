import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int w = sc.nextInt();
        
        if (w % 2 == 0 && w != 2 && w > 0) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
        
        sc.close();
    }
}
