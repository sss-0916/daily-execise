import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str.reverse());
        
        sc.close();
    }
}