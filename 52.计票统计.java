import java.util.*;

public class Main {
    private static LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int num = 0;
        while (in.hasNextInt()) {
            map.clear();
            
            num = in.nextInt();
            for (int i = 0; i < num; ++i) {
                map.put(in.next(), 0);
            }
            map.put("Invalid", 0);
            
            num = in.nextInt();
            String candicate = "";
            for (int i = 0; i < num; ++i) {
                candicate = in.next();
                if (map.containsKey(candicate)) {
                    map.put(candicate, map.get(candicate) + 1);
                    continue;
                }
                
                map.put("Invalid", map.get("Invalid") + 1);
            }
            
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.printf("%s : %d\n", entry.getKey(), entry.getValue());
            }
        }
        
        in.close();
    }
}