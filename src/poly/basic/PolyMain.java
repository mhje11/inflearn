package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        //부모가 자식 인스턴스 참조 (부모는 자식참조가능)
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();

//        Child child1 = new Parent(); //자식은 부모 참조불가
//        poly.childMethod(); //poly 는 parent타입이니까 자식의 기능은 호출불가



    }
}
