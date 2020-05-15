import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = 0, B = 0, C = 0, D = 0;
        int[] nums = new int[4];
        for (int i = 0; i < 4; ++i) {
            nums[i] = sc.nextInt();
        }
        
        A = (nums[0] + nums[2]) / 2;
        B = A - nums[0];
        C = B - nums[1];
        
        if (B + C != nums[3]) {
            System.out.println("No");
            return;
        }
        
        System.out.printf("%d %d %d\n", A, B, C);
    }
}