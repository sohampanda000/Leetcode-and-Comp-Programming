import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        StringBuffer sb = new StringBuffer();

        String s = sc.next();
        int size = sc.nextInt();

        if (size <= s.length() && size > 0) {
            for (int i = 0; i <= s.length() - size; i++) {
                sb.append(s.substring(i, i + size));
                sb.append(",");
            }

            String res = sb.toString();
            String arr[] = res.split(",");

            Arrays.sort(arr);

            System.out.println(arr[0]);
            System.out.println(arr[arr.length - 1]);
        }
    }
}
