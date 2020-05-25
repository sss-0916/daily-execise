import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNextInt()) {
            int m = sc.nextInt();
            int Sn = m * m * m;
            int a1 = (Sn - m * (m - 1)) / m;
            
            for (int i = 0; i < m; ++i) {
                System.out.print(a1);
                a1 += 2;
                if (i == m - 1) {
                    break;
                }
                System.out.print("+");
            }
            System.out.println();
        }
        
        sc.close();
    }
}