import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char[] nums = sc.nextLine().toCharArray();
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (char num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        for (Entry<Character, Integer> entry : map.entrySet()) {
            System.out.printf("%c:%d\n", entry.getKey(), entry.getValue());
        }
        
        sc.close();
    }
}