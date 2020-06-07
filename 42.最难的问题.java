import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        while (in.hasNextLine()) {
            char[] chars = in.nextLine().toCharArray();
            int len = chars.length;
            for (int i = 0; i < len; ++i) {
                char ch = chars[i];
                if (ch >= 'A') {
                    chars[i] = (char)(ch > 'E' ? (ch - 5) : (ch + 21));
                }
            }
            
            System.out.println(new String(chars));
        }
        
        in.close();
    }
}