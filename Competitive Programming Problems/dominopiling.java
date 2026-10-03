import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        
        int area = Integer.parseInt(line[0]) * Integer.parseInt(line[1]);
        int dominoes = area / 2;
        
        System.out.print(dominoes);
    }
}
