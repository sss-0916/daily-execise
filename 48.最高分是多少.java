import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int N = in.nextInt();
            int M = in.nextInt();
            int[] scores = new int[N];
            for (int i = 0; i < N; ++i) {
                scores[i] = in.nextInt();
            }
            
            for (int i = 0; i < M; ++i) {
                String opt = in.next();
                int n = in.nextInt(), m = in.nextInt();
                
                if ("U".equals(opt)) {
                    scores[n - 1] = m;
                    continue;
                }
                if ("Q".equals(opt)) {
                    int start = Math.min(m, n), end = Math.max(m, n);
                    int result = scores[start - 1];
                    for (int j = start; j < end; ++j) {
                        result = Math.max(result, scores[j]);
                    }
                    System.out.println(result);
                }
            }
        }
        
        in.close();
    }
}