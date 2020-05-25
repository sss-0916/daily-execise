import java.util.Scanner;

public class Main {
    private static final int LEN = 10;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[LEN];
        
        while (sc.hasNextInt()) {
            for (int i = 0; i < LEN; ++i) {
                nums[i] = sc.nextInt();
            }

            for (int i = 1; i < LEN; ++i) {
                if (nums[i] != 0) {
                    System.out.print(i);
                    --nums[i];
                    break;
                }
            }
            for (int i = 0; i < LEN; ++i) {
                while (nums[i] != 0) {
                    System.out.print(i);
                    --nums[i];
                }
            }
            System.out.println();
        }
        
        sc.close();
    }
}