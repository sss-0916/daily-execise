import java.util.Scanner;
import java.util.HashSet;

public class Main {
    private static HashSet<Integer> fibSet = new HashSet<>();
    static {
        int prev = 0, cur = 1, next = 0;
        for (int i = 0; i < 40; ++i) {
            next = cur + prev;
            fibSet.add(next);
            
            prev = cur;
            cur = next;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = 0, steps = 0;
        while (sc.hasNextInt()) {
            num = sc.nextInt();
            
            while (true) {
                if (fibSet.contains(num + steps) || fibSet.contains(num - steps)) {
                    break;
                }
                ++steps;
            }
            
            System.out.println(steps);
        }
        
        sc.close();
    }
}