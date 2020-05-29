import java.util.Scanner;
import java.util.HashMap;

public class Main {
    private static HashMap<Integer, Integer> scoreMap = new HashMap<>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = 0, score = 0;
        while (sc.hasNextInt()) {
            scoreMap.clear();
            
            N = sc.nextInt();
            if (N == 0) {
                break;
            }
            
            for (int i = 0; i < N; ++i) {
                score = sc.nextInt();
                scoreMap.put(score, scoreMap.getOrDefault(score, 0) + 1);
            }
            
            System.out.println(scoreMap.getOrDefault(sc.nextInt(), 0));
        }
        
        sc.close();
    }
}