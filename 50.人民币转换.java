import java.util.*;

public class Main{

    private static String[] map = {"壹","贰","叁","肆","伍","陆","柒","捌","玖"};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(in.hasNext()) {
            String number = in.next();

            resolve(number);
        }

        in.close();
    }

    public static void resolve(String str){

        String[] strArr = str.split("\\.");
        int number = Integer.valueOf(str.split("\\.")[0]);

        StringBuffer res = new StringBuffer("人民币");
        int yi = (int)(number / 100000000);
        if (yi != 0) {
            res.append(resolveQian(yi)).append("亿");
            number = number - yi * 100000000;
        }

        int wan = (int)(number / 10000);
        if (wan != 0) {
            res.append(resolveQian(wan)).append("万");
            number = number - wan * 10000;
        }

        String beforePointString = resolveQian(number);
        if (beforePointString.length() > 1) {
            res.append(beforePointString).append("元");
        }

        if (strArr.length > 1) {
            String afterPointStr = strArr[1];
            res.append(handleNumberAfterPoint(afterPointStr));
        }

        String resString = res.toString();

        if (resString.length() > 4 && resString.charAt(3) == '零' && resString.charAt(4) != '元') {
            resString = resString.substring(0, 3) + resString.substring(4);
        }

        System.out.println(resString);

    }

    public static String resolveQian(double temp) {

        StringBuffer resBuffer = new StringBuffer();

        int qian = (int)(temp / 1000);
        if (qian != 0) {
            resBuffer.append(map[qian - 1]).append("仟");
            temp = temp - qian * 1000;
        }

        int bai = (int)(temp / 100);
        if (bai != 0) {
            resBuffer.append(map[bai - 1]).append("佰");
            temp = temp - bai * 100;
        }
        if (qian != 0 && bai == 0) {
            resBuffer.append("零");
        }

        int shi = (int)(temp / 10);
        if (shi != 0) {
            if (shi != 1) {
                resBuffer.append(map[shi - 1]);
            }
            resBuffer.append("拾");
            temp = temp - shi * 10;
        }

        if (bai != 0 && shi == 0) {
            resBuffer.append("零");
        }

        int ge = (int)(temp % 10);


        if (ge != 0) {
            if (qian == 0 && bai == 0 && shi == 0) {
                resBuffer.append("零");
            }
            resBuffer.append(map[ge - 1]);
        }
        String res = resBuffer.toString();
        return res;
    }

    public static String handleNumberAfterPoint(String str){
        String res = "";
        if (str.equals("00") ||str.equals("0")) {
            res = "整";
        } else {
            if (str.charAt(0) != '0') {
                res += map[Integer.valueOf(str.charAt(0) + "") - 1] + "角";
            }
            if (str.length() > 1 && str.charAt(1) != '0') {
                res += map[Integer.valueOf(str.charAt(1) + "") - 1] + "分";
            }
        }
        return res;
    }
}