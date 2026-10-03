// 1952. Three Divsors
public class Solution {
    public boolean isThree(int n) {
        if (n <= 3) {
            return n == 3;
        }

        int divisors = 2;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (Math.floor(n / i) == i) {
                    divisors += 1;
                } else {
                    divisors += 2;
                }
            }
        }
        
        return divisors == 3;
    }
}
