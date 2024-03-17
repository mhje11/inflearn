package poly.ex.pay0;

public class KakaoPay implements PayService{
    @Override
    public void processPay(String payOption, int amount) {
        if(payOption.equals("kakao")) {
            System.out.println("결제를 시작합니다 : option = " + payOption + ", amount = " + amount);
            System.out.println("카카오페이 시스템과 연결합니다.");
            System.out.println(amount + "결제를 시도합니다.");
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제를 시작합니다 : option = " + payOption + ", amount = " + amount);
            System.out.println("결제 수단이 없습니다.");
            System.out.println("결제가 실패했습니다.");

        }
    }
}
