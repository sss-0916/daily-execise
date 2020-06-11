import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        while (in.hasNextInt()) {
            int nums = in.nextInt();
            int ability = in.nextInt();
            for (int i = 0; i < nums; ++i) {
                int monster = in.nextInt();
                if (monster <= ability) {
                    ability += monster;
                } else {
                    ability += gcd(ability, monster);
                }
            }
            
            System.out.println(ability);
        }
        
        in.close();
    }
    
    private static int gcd(int num1, int num2) {
        for (int i = Math.min(num1, num2); i > 1; --i) {
            if (num1 % i == 0 && num2 % i == 0) {
                return i;
            }
        }
        return 1;
    }
}