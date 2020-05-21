import java.util.ArrayList;
public class Solution {
    public int[] multiply(int[] A) {
        int len = A.length;
        int[] B = new int[len];
        
        B[0] = 1;
        for (int i = 1; i < len; ++i) {
            B[i] = B[i - 1] * A[i - 1];
        }
        
        int tmp = 1;
        for (int i = len - 2; i >= 0; --i) {
            tmp *= A[i + 1];
            B[i] *= tmp;
        }
        
        return B;
    }
}