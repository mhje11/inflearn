package poly.diamond;

public class DiamondMain {
    public static void main(String[] args) {
        InterfaceA a = new Child();
        a.methodA();
        a.methodCommon();

        InterfaceB b = new Child();
        b.methodCommon();
        b.methodB();

        Child c = new Child();
        c.methodCommon();
    }
}
