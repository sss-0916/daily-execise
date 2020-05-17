import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, col, result = 0;
        
        row = sc.nextInt();
        col = sc.nextInt();
        int[][] grid = new int[row][col];
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                if (grid[i][j] == 0) {
                    ++result;
                    
                    if (i + 2 < row) {
                        grid[i + 2][j] = -1;
                    }
                    if (j + 2 < col) {
                        grid[i][j + 2] = -1;
                    }
                }
            }
        }
        
        System.out.println(result);
    }
}