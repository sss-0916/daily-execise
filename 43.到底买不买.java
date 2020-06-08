import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String have = in.nextLine();
        String need = in.nextLine();

        Map<Character, Integer> h = new HashMap<>();
        for (char c : have.toCharArray()) {
            h.put(c, h.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> n = new HashMap<>();
        for (char c : need.toCharArray()) {
            n.put(c, n.getOrDefault(c, 0) + 1);
        }

        boolean weatherBy = true;
        int lack = 0;
        for (Entry<Character, Integer> en : n.entrySet()) {
            char k = en.getKey();
            int v = en.getValue();
            if (h.containsKey(k) && h.get(k) < v) {
                weatherBy = false;
                lack += v - h.get(k);
            } else if (!h.containsKey(k)) {
                weatherBy = false;
                lack += v;
            }
        }
        if (weatherBy) {
            System.out.println("Yes " + (have.length() - need.length()));
        } else {
            System.out.println("No " + lack);
        }
    }
}