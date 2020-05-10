import java.util.*;

public class Finder {
    public int findKth(int[] a, int n, int K) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int num : a) {
            queue.offer(num);
            if (queue.size() > K) {
                queue.poll();
            }
        }
        
        return queue.poll();
    }
}