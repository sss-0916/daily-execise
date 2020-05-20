import java.util.*;

public class Robot {
    public int countWays(int x, int y) {
        int[][] dp = new int[x + 1][y + 1];
        
        for (int i = 1; i <= x; ++i) {
            dp[i][1] = 1;
        }
        for (int i = 1; i <= y; ++i) {
            dp[1][i] = 1;
        }
        
        for (int i = 2; i <= x; ++i) {
            for (int j = 2; j <= y; ++j) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        
        return dp[x][y];
    }
}