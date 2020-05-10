import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        
        int cnt = 0, len = A.length();
        
        for (int i = 0; i <= len; ++i) {
            StringBuilder curStr = new StringBuilder(A);
            curStr.insert(i, B);
            if (isPalindrome(curStr)) {
                ++cnt;
            }
        }
        
        System.out.println(cnt);
    }
    
    private static boolean isPalindrome(StringBuilder str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}