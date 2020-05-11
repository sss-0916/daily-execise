import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empty = 0, total = 0;
        
        while (sc.hasNextInt()) {
            total = 0;
            empty = sc.nextInt();
            
            while (empty > 2) {
                total += empty / 3;
                empty = empty / 3 + empty % 3;
            }
            
            if (empty == 2) {
                ++total;
            }
            
            System.out.println(total);
        }
    }
}