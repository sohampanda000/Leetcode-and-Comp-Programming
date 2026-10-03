import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        
        if (word.length() > 0) {
            char firstChar = word.charAt(0);
            char capitalfirstChar = Character.toUpperCase(firstChar);
            
            String wordOut = word.substring(1);
            String capitalizedWord = String.valueOf(capitalfirstChar) + wordOut;
            System.out.println(capitalizedWord);
        }
        
        sc.close();
    }
}
