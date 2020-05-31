public class Main {
    public static void main(String[] args) {
        long money = 0, curMoney = 1;
        for (int i = 0; i < 30; ++i) {
            money += curMoney;
            curMoney *= 2;
        }
        
        System.out.println(300 + " " + money);
    }
}