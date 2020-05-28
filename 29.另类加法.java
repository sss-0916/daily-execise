import java.util.*;

public class UnusualAdd {
    public int addAB(int A, int B) {
        int tmp = 0;
        while (B != 0) {
            tmp = A ^ B;
            B = (A & B) << 1;
            A = tmp;
        }
        
        return A;
    }
}