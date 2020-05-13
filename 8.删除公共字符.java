import java.util.Arrays;
import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] originArr = sc.nextLine().toCharArray();
        char[] bookArr = sc.nextLine().toCharArray();
        
        HashSet<Character> bookSet = new HashSet<>();
        for (char ch : bookArr) {
            bookSet.add(ch);
        }
        
        StringBuilder result = new StringBuilder();
        for (char ch : originArr) {
            if (!bookSet.contains(ch)) {
                result.append(ch);
            }
        }
        
        System.out.println(result);
    }
}