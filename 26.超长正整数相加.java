import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNextLine()) {
            char[] numArr1 = sc.nextLine().toCharArray();
            char[] numArr2 = sc.nextLine().toCharArray();

            StringBuilder result = new StringBuilder();
            int i = numArr1.length - 1, j = numArr2.length - 1;
            int carry = 0, sum = 0, num1 = 0, num2 = 0;
            while (i >= 0 || j >= 0 || carry != 0) {
                num1 = i >= 0 ? numArr1[i--] - '0' : 0;
                num2 = j >= 0 ? numArr2[j--] - '0' : 0;

                sum = num1 + num2 + carry;
                result.append(sum % 10);
                carry = sum / 10;
            }

            System.out.println(result.reverse());
        }
        
        sc.close();
    }
}