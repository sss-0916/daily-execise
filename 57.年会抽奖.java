import java.util.*;

public class Main {
    private static long[] errs = new long[21];
    private static long[] full = new long[21];
    static {
        errs[0] = 0; errs[1] = 0; errs[2] = 1;
        full[0] = 0; full[1] = 1; full[2] = 2;
        for (int i = 3; i < errs.length; ++i) {
            errs[i] = (i - 1) * (errs[i - 1] + errs[i - 2]);
            full[i] = full[i - 1] * i;
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        while (in.hasNextInt()) {
            int n = in.nextInt();
            System.out.printf("%.2f%%\n", 1.0 * errs[n] / full[n] * 100);
        }
        
        in.close();
    }
}