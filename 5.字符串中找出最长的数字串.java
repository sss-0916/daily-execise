import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            int maxCnt = 0, cnt = 0, endIndex = 0, len = str.length();
            for (int i = 0; i < len; ++i) {
                char ch = str.charAt(i);
                if (Character.isDigit(ch)) {
                    ++cnt;
                    if (cnt > maxCnt) {
                        endIndex = i;
                        maxCnt = cnt;
                    }
                } else {
                    cnt = 0;
                }
            }
            
            System.out.println(str.substring(endIndex - maxCnt + 1, endIndex + 1));
        }
    }
}