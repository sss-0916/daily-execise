import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        while (in.hasNextInt()) {
            System.out.println(isKeepShape(in.nextInt()) ? "Yes!" : "No!");
        }
        
        in.close();
    }
    
    private static boolean isKeepShape(int num) {
        return String.valueOf((num * num)).endsWith(String.valueOf(num));
    }
}