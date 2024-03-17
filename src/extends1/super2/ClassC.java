package extends1.super2;

public class ClassC extends ClassB{

    public ClassC() {
        super(10, 20);//super는 기본생성자인 경우만 생략가능
        System.out.println("Classc 생성자 ");
    }
}
