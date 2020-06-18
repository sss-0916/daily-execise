import java.util.*;

public class Main {
    private static List<String> nums = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int N = 0;
        while (in.hasNextInt()) {
            nums.clear();
            
            N = in.nextInt();
            for (int i = 0; i < N; ++i) {
                nums.add(in.next());
            }
            
            nums.sort(new Comparator<String>(){
                @Override
                public int compare(String o1, String o2) {
                    int len1 = o1.length();
                    int len2 = o2.length();
                    if (len1 != len2) {
                        return len1 - len2;
                    }
                    
                    return o1.compareTo(o2);
                }
            });
            
            for (String num : nums) {
                System.out.println(num);
            }
        }
        
        in.close();
    }
}