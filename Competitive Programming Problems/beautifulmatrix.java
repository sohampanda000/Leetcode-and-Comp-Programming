import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] matrix = new String[5][5];

        for (int k = 0; k < 5; k++) {
            matrix[k] = sc.nextLine().split(" ");
        }

        int row = 0;
        int col = 0;
        int moves = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j].contains("1")) {
                    row = i;
                    col = j;
                }
            }
        }
        
        moves = Math.abs(row - 2) + Math.abs(col - 2);
        System.out.print(moves);
      
        /*
        ALTERNATIVE MATRIX BEAUTIFICATION PROCESS
        if (row == 1 || row == 0) {
            moves += 2 - row;
        } else {
            moves += row - 2;
        }
        
        if (col < 2) {
            moves += 2 - col;
        } else {
            moves += col - 2;
        }
        
        System.out.print(moves);
        */
    }
}
