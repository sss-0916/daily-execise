import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNextInt()) {
            int N = sc.nextInt();

            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < N; ++i) {
                list.add(i);
            }

            int removeIndex = 0;
            while (list.size() > 1) {
                removeIndex = (removeIndex + 2) % list.size();
                list.remove(removeIndex);
            }

            System.out.println(list.get(0));
        }
        
        sc.close();
    }
}