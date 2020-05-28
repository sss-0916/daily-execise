import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x0 = sc.nextInt(), cnt = 0;
        while (x0 != 0 && cnt <= 300000) {
            x0 = (2 * x0 + 1) % 1000000007;
            ++cnt;
        }
        
        int result = (cnt + 2) / 3;
        
        System.out.println(result > 100000 ? -1 : result);
        
        sc.close();
    }
}