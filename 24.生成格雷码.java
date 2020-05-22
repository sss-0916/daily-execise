import java.util.*;

public class GrayCode {
    public String[] getGray(int n) {
        if (n == 1) {
            return new String[]{"0", "1"};
        }
        
        String[] prev = getGray(n - 1);
        int len = prev.length;
        
        String[] result = new String[len * 2];
        for (int i = 0; i < len; ++i) {
            result[i] = "0" + prev[i];
            result[2 * len - 1 - i] = "1" + prev[i];
        }
        return result;
    }
}