import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        while (in.hasNext()) {
            String passwd = in.nextLine();
            
            System.out.println(
                (checkLen(passwd) && checkKinds(passwd) && checkRepeat(passwd)) ? "OK" : "NG"
            );
        }
        
        in.close();
    }
    
    private static boolean checkLen(String passwd) {
        return passwd.length() > 8;
    }
    
    private static boolean checkKinds(String passwd) {
        int digit = 0, upperChar = 0, lowerChar = 0, other = 0;
        for (char ch : passwd.toCharArray()) {
            if (Character.isDigit(ch)) {
                digit = 1;
                continue;
            } else if (Character.isLowerCase(ch)) {
                lowerChar = 1;
            } else if (Character.isUpperCase(ch)) {
                upperChar = 1;
            } else {
                other = 1;
            }
        }
        
        return digit + upperChar + lowerChar + other >= 3;
    }
    
    private static boolean checkRepeat(String passwd) {
        for (int i = 0; i < passwd.length() - 2; ++i) {
            String subStr = passwd.substring(i, i + 3);
            if (passwd.substring(i + 3).contains(subStr)) {
                return false;
            }
        }
        return true;
    }
}