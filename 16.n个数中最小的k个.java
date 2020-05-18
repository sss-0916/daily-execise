import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNextLine()) {
            String[] strs = sc.nextLine().split(" ");
            int len = strs.length - 1, k = Integer.parseInt(strs[len]);

            int[] nums = new int[len];
            for (int i = 0; i < len; ++i) {
                nums[i] = Integer.parseInt(strs[i]);
            }

            Arrays.sort(nums);

            for (int i = 0; i < k; ++i) {
                System.out.print(nums[i]);
                if (i != k - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        sc.close();
    }
}