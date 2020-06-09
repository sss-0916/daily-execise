import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int A1 = 0, A2 = 0, A3 = 0, A5 = 0;
        int times2 = 0, times4 = 0;
        double A4 = 0;
        boolean flag = false;

        for (int i = 0; i < N; ++i) {
            int num = in.nextInt();

            switch (num % 5) {
                case 0:
                    if (num % 2 == 0)
                        A1 += num;
                    break;
                case 1:
                    A2 += flag ? -num : num;
                    flag = !flag;
                    ++times2;
                    break;
                case 2:
                    ++A3;
                    break;
                case 3:
                    A4 += num;
                    ++times4;
                    break;
                case 4:
                    A5 = Math.max(A5, num);
            }
        }

        A4 /= times4;

        if (A1 > 0) {
            System.out.print(A1 + " ");
        } else {
            System.out.print("N ");
        }

        if (times2 > 0) {
            System.out.print(A2 + " ");
        } else {
            System.out.print("N ");
        }

        if (A3 > 0) {
            System.out.print(A3 + " ");
        } else {
            System.out.print("N ");
        }

        if (times4 > 0) {
            System.out.printf("%.1f ", A4);
        } else {
            System.out.print("N ");
        }

        if (A5 > 0) {
            System.out.println(A5);
        } else {
            System.out.println("N");
        }

        in.close();
    }
}