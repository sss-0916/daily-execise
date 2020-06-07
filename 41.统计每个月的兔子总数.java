import java.util.*;

public class Main {
    private static int[] fib = new int[40];
    static {
        fib[1] = 1;
        fib[2] = 1;
        
        for (int i = 3; i < 40; ++i) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        while (in.hasNextInt()) {
            System.out.println(fib[in.nextInt()]);
        }
        
        in.close();
    }
}