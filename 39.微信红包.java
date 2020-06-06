import java.util.*;

public class Gift {
    public int getValue(int[] gifts, int n) {
        Arrays.sort(gifts);
        
        int result = gifts[n / 2], times = 0;
        for (int i = 0; i < n; ++i) {
            if (gifts[i] == result) {
                ++times;
            }
        }
        
        return times >= n / 2 ? result : 0;
    }
}