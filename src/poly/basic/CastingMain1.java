package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        Parent poly = new Child();
//        poly.childMethod(); //부모가 자식기능은 참조불가

        //다운 캐스팅 부모 --> 자식
        Child child = (Child)poly;
        child.childMethod(); //참조값이 child타입이 됨 poly가 child가 되는게 아님

    }
}
