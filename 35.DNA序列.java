import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String gene = in.nextLine(), result = null;
        int num = in.nextInt(), len = gene.length();
        double maxRatio = 0;
        for (int i = 0; i <= len - num; ++i) {
            String curGene = gene.substring(i, i + num);
            double curRatio = GCRatio(curGene.toCharArray(), num);
            if (curRatio > maxRatio) {
                result = curGene;
                maxRatio = curRatio;
            }
        }
        
        System.out.println(result);
    }
    
    private static double GCRatio(char[] geneArr, int num) {
        int cnt = 0;
        for (char ch : geneArr) {
            if (ch == 'G' || ch == 'C') {
                ++cnt;
            }
        }
        
        return cnt / (double)num;
    }
}