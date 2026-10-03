import java.util.Stack;

public class Solution {
    public int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int maxSide = 0;
        int[] heights = new int[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == '1') {
                    heights[j]++;
                } else {
                    heights[j] = 0;
                }
            }
            maxSide = Math.max(maxSide, largestSquareInHistogram(heights));
        }
        return maxSide * maxSide;
    }

    private int largestSquareInHistogram(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxSide = 0;

        for (int i = 0; i <= heights.length; i++) {
            int height;
            if (i == heights.length) {
                height = 0;
            } else {
                height = heights[i];
            }

            while (!stack.isEmpty() && height < heights[stack.peek()]) {
                int h = heights[stack.pop()];
                int width;
                if (stack.isEmpty()) {
                    width = i;
                } else {
                    width = i - stack.peek() - 1;
                }
                int side = Math.min(h, width);
                maxSide = Math.max(maxSide, side);
            }
            stack.push(i);
        }
        return maxSide;
    }
}
