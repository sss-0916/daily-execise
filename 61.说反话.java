import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        while (in.hasNextLine()) {
            String[] words = in.nextLine().split(" ");
            
            for (int i = words.length - 1; i >= 0; --i) {
                System.out.print(words[i]);
                if (i == 0) {
                    continue;
                }
                
                System.out.print(" ");
            }
            System.out.println();
        }
        
        in.close();
    }
}