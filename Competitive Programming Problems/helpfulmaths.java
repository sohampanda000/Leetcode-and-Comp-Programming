import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sumString = scanner.nextLine();

        String[] numbers = sumString.split("\\+");
        Arrays.sort(numbers);

        String result = String.join("+", numbers);
        System.out.println(result);
        
        scanner.close();
    }
}
