import java.util.*;

public class Main {
    private static int[] credits = new int[10];
    private static int[] scores = new int[10];
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = 0, allCredits = 0;
        while (in.hasNextInt()) {
            n = in.nextInt();
            for (int i = 0; i < n; ++i) {
                credits[i] = in.nextInt();
                allCredits += credits[i];
            }
            for (int i = 0; i < n; ++i) {
                scores[i] = in.nextInt();
            }
            
            double creditSum = 0;
            int score = 0, credit = 0;
            for (int i = 0; i < n; ++i) {
                score = scores[i];
                credit = credits[i];
                if (score >= 90 && score <= 100) {
                    creditSum += credit * 4.0;
                } else if (score >= 85 && score <= 89) {
                    creditSum += credit * 3.7;
                } else if (score >= 82 && score <= 84) {
                    creditSum += credit * 3.3;
                } else if (score >= 78 && score <= 81) {
                    creditSum += credit * 3.0;
                } else if (score >= 75 && score <= 77) {
                    creditSum += credit * 2.7;
                } else if (score >= 72 && score <= 74) {
                    creditSum += credit * 2.3;
                } else if (score >= 68 && score <= 71) {
                    creditSum += credit * 2.0;
                } else if (score >= 64 && score <= 67) {
                    creditSum += credit * 1.5;
                } else if (score >= 60 && score <= 63) {
                    creditSum += credit * 1.0;
                } else {
                    creditSum += credit * 0;
                }
            }
            
            System.out.printf("%.2f\n", creditSum / allCredits);
        }
        
        in.close();
    }
}