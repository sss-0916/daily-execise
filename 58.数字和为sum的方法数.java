import java.util.*;

public class Main {
    private static long[][] dp = new long[1001][1001];
    static {
        for (int i = 0; i < dp.length; ++i) {
            dp[0][i] = 0;
            dp[i][0] = 1;
        }
    }
    
    private static int[] nums = new int[1001];
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = 0, sum = 0;
        while (in.hasNextInt()) {
            n = in.nextInt();
            sum = in.nextInt();
            
            for (int i = 1; i <= n; ++i) {
                nums[i] = in.nextInt();
            }
            
            for (int i = 1; i <= n; ++i) {
                for (int j = 1; j <= sum; ++j) {
                    dp[i][j] = nums[i] > j ? dp[i - 1][j] : dp[i - 1][j] + dp[i - 1][j - nums[i]];
                }
            }
            
            System.out.println(dp[n][sum]);
        }
        
        in.close();
    }
}