import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Map<String, Integer> map = new LinkedHashMap<>();
        String line = "";
        while (in.hasNextLine()) {
            line = in.nextLine();
            int pos = line.lastIndexOf("\\");
            line = pos == -1 ? line : line.substring(pos + 1);
            map.put(line, map.getOrDefault(line, 0) + 1);
        }
        
        List<Map.Entry<String, Integer>> entrys = new ArrayList<>(map.entrySet());
        entrys.sort(new Comparator<Map.Entry<String, Integer>>(){
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        
        int cnt = 0, len = 0;
        for (Map.Entry<String, Integer> entry : entrys) {
            if (cnt >= 8) {
                break;
            }
            
            String[] tokens = entry.getKey().split(" ");
            len = tokens[0].length();
            tokens[0] = len > 16 ? tokens[0].substring(len - 16) : tokens[0];
            
            System.out.printf("%s %s %d\n", tokens[0], tokens[1], entry.getValue());
            
            ++cnt;
        }
    }
}