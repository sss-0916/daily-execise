import java.util.Scanner;

public class Main {
    private static int[] pokers = new int[200];
    private static int[] tmp = new int[200];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int groups = sc.nextInt();
        while (groups-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            for (int i = 0; i < 2 * n; ++i) {
                pokers[i] = sc.nextInt();
            }
            
            for (int i = 0; i < k; ++i) {
                shuffle(n);
            }
            
            for (int i = 0; i < 2 * n; ++i) {
                System.out.print(pokers[i]);
                if (i == 2 * n - 1) {
                    break;
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        
        sc.close();
    }
    
    private static void shuffle(int n) {
        int i = n - 1, j = 2 * n - 1, k = 2 * n - 1;
        boolean flag = false;
        while (i >= 0 || j >= n) {
            tmp[k--] = flag ? pokers[i--] : pokers[j--];
            flag = !flag;
        }
        
        for (i = 0; i < 2 * n; ++i) {
            pokers[i] = tmp[i];
        }
    }
}