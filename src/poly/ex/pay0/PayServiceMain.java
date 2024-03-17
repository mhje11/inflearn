package poly.ex.pay0;

public class PayServiceMain {
    public static void main(String[] args) {
        KakaoPay kakaoPay = new KakaoPay();
        Naverpay naverpay = new Naverpay();
        kakaoPay.processPay("kakao", 5000);
        naverpay.processPay("naver", 10000);
        kakaoPay.processPay("bad", 15000);
    }
}
