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

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr, int n) {
        double zero = 0.0;
        double positive = 0.0;
        double negative = 0.0;

        for (int i = 0; i < n; i++) {
            if (arr.get(i) > 0) {
                positive += 1.0;
            } else if (arr.get(i) == 0) {
                zero += 1.0;
            } else if (arr.get(i) < 0) {
                negative += 1.0;
            }
        }

        positive /= n;
        negative /= n;
        zero /= n;

        System.out.println(String.format("%.6f", positive));
        System.out.println(String.format("%.6f", negative));
        System.out.println(String.format("%.6f", zero));

    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr, n);

        bufferedReader.close();
    }
}
