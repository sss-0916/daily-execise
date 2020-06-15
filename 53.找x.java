import java.util.*;

public class Main {
    private static int[] nums = new int[200];
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = 0, x = 0;
        while (in.hasNextInt()) {
            n = in.nextInt();
            for (int i = 0; i < n; ++i) {
                nums[i] = in.nextInt();
            }
            
            System.out.println(find(n, in.nextInt()));
        }
        
        in.close();
    }
    
    private static int find(int len, int target) {
        for (int i = 0; i < len; ++i) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}