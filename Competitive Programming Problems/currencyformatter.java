import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();

        NumberFormat US = NumberFormat.getCurrencyInstance(Locale.US);
        String USFA = US.format(payment);

        Locale indiaLocale = new Locale("en", "IN");

        NumberFormat IN = NumberFormat.getCurrencyInstance(indiaLocale);
        String INFA = IN.format(payment);

        NumberFormat CN = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String CNFA = CN.format(payment);

        NumberFormat FR = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String FRFA = FR.format(payment);

        System.out.println("US: " + USFA);
        System.out.println("India: " + INFA);
        System.out.println("China: " + CNFA);
        System.out.println("France: " + FRFA);

        sc.close();
    }
}
