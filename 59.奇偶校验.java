import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        char[] chars = in.next().toCharArray();
        for (char ch : chars) {
            String tmp = String.format("%07d", Integer.parseInt(Integer.toBinaryString(ch)));
            int times = 0;
            for (int i = 0; i < 7; ++i) {
                times += tmp.charAt(i) == '1' ? 1 : 0;
            }

            System.out.println(times % 2 == 0 ? "1" + tmp : "0" + tmp);
        }
        
        in.close();
    }
}