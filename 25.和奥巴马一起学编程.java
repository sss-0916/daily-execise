import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNextInt()) {
            int col = sc.nextInt(), row = (col + 1) / 2;
            char ch = sc.next().charAt(0);
            
            for (int i = 0; i < row; ++i) {
                for (int j = 0; j < col; ++j) {
                    if (i == 0 || i == row - 1 || j == 0 || j == col - 1) {
                        System.out.print(ch);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        
        sc.close();
    }
}