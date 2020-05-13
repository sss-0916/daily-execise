import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 0; i <= n; ++i) {
            if (dp[i] == Integer.MAX_VALUE) {
                continue;
            }

            if (i + 6 <= n) {
                dp[i + 6] = Math.min(dp[i] + 1, dp[i + 6]);
            }
            if (i + 8 <= n) {
                dp[i + 8] = Math.min(dp[i] + 1, dp[i + 8]);
            }
        }

        dp[n] = (dp[n] == Integer.MAX_VALUE) ? -1 : dp[n];
        System.out.println(dp[n]);
    }
}