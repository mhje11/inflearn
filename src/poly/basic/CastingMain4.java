package poly.basic;

public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child)parent1;
        child1.childMethod(); //문제없음

        Parent parent2 = new Parent();
        Child child2 = (Child) parent2; //런타임 오류 - classCasting Exception
        child2.childMethod(); //실행 불가 , 자식을 생성하지 않았기때문에 캐스팅이안됨

        //upcasting은 자식을 생성해도 위의 부모가 다생성됨
        //downcasting은 부모를 만들어도 자식이 생성되지 않기떄문에 런타임오류

    }
}
