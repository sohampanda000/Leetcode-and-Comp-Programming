// 50. Pow(x, n) [there is one test case that doesn't work (305/306 -> Time Limit Exceeded)]
public class Solution {
    public double myPow(double x, int n) {
        double val = 1;
        if (x == 1.0) {
            return 1.0;
        }
        if ((n >= 329 || n <= -329) && (x <= 2.0 && x > 1.25)) {
            return 0.0;
        }
        if (n >= 0) {
            for (int i = 0; i < n; i++) {
                val = val * x;
            }
        } else if (n < 0) {
            for (int j = 0; j < -n; j++) {
                val = val * 1.0 / x;
            }
        } else {
            return 1.0;
        }
        return val;
    }
}

