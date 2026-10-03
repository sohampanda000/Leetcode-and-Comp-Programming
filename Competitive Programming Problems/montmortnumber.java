/* time limit exceeded, only solution here would be through dynamic programming */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        sc.close();

        int N = Integer.parseInt(line[0]);
        int M = Integer.parseInt(line[1]);

        for (int i = 1; i <= N; i++) {
            System.out.print(derangement(i) % M + " ");
        }
    }

    private static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1L;
        } else {
            return n * factorial(n - 1);
        }
    }

    private static long derangement(int N) {
        long sum = 0;
        for (int k = 0; k <= N; k++) {
            sum += (long) (factorial(N) * Math.pow(-1, k) / factorial(k));
        }
        return sum;
    }
}
