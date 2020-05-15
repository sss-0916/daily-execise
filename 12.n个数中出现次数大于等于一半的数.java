import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] numStr = sc.nextLine().split(" ");
        int[] nums = new int[numStr.length];
        for (int i = 0; i < numStr.length; ++i) {
            nums[i] = Integer.parseInt(numStr[i]);
        }
        
        int result = nums[0], cnt = 0;
        for (int i = 1; i < nums.length; ++i) {
            if (result == nums[i]) {
                ++cnt;
            } else if (cnt > 0) {
                --cnt;
            } else {
                result = nums[i];
            }
        }
        
        System.out.println(result);
    }
}