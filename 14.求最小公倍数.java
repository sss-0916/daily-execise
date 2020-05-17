import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println(lcm(sc.nextInt(), sc.nextInt()));
        
        sc.close();
    }
    
    private static int lcm(int m, int n) {
        for (int i = Math.max(m, n); i < m * n; ++i) {
            if (i % m == 0 && i % n == 0) {
                return i;
            }
        }
        
        return m * n;
    }
}