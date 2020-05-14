import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] goods = new int[n];
        for (int i = 0; i < n; ++i) {
            goods[i] = sc.nextInt();
        }
        
        int[][] dp = new int[n + 1][41];
        dp[0][0] = 1;
        for (int i = 1; i <= n; ++i) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <= 40; ++i) {
            dp[0][i] = 0;
        }
        
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= 40; ++j) {
                if (goods[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - goods[i - 1]];
                }
            }
        }
        
        System.out.println(dp[n][40]);
    }
}