package poly.basic;

public class CastingMain3 {
    //upcasting vs downcasting
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = (Parent)child; //업캐스팅은 생략가능, 생략권장
        Parent parent2 = child; //업캐스팅 생략한거

        parent1.parentMethod();
        parent2.parentMethod();
    }
}
