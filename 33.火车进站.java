import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Main {
    private static ArrayList<String> results = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int[] trains = new int[num];
        for (int i = 0; i < num; ++i) {
            trains[i] = sc.nextInt();
        }
        
        trainOut(trains, new Stack<Integer>(), "", 0, 0);
        Collections.sort(results);
        
        for (String result : results) {
            System.out.println(result);
        }
    }
    
    private static void trainOut(
        int[] trains, Stack<Integer> stack, String result, int inCnt, int outCnt
    ) {
        if (outCnt == trains.length) {
            results.add(result);
        }
        
        if (!stack.isEmpty()) {
            int tmp = stack.pop();
            trainOut(trains, stack, result + tmp + " ", inCnt, outCnt + 1);
            stack.push(tmp);
        }
        
        if (inCnt < trains.length) {
            stack.push(trains[inCnt]);
            trainOut(trains, stack, result, inCnt + 1, outCnt);
            stack.pop();
        }
    }
}