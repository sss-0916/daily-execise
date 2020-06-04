import java.util.*;

public class Substr {
    public boolean[] chkSubStr(String[] p, int n, String s) {
        boolean[] results = new boolean[n];
        for (int i = 0; i < n; ++i) {
            results[i] = s.indexOf(p[i]) == -1 ? false : true;
        }
        
        return results;
    }
}