import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int num = 0;
        while (in.hasNextInt()) {
            num = in.nextInt();
            
            System.out.printf("%d %d\n", digitSum(num), digitSum(num * num));
        }
        
        in.close();
    }
    
    private static int digitSum(int num) {
        int sum = 0;
        for (; num != 0; num /= 10) {
            sum += num % 10;
        }
        return sum;
    }
}