package poly.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);
        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        // 왼쪽 instanceof 오른쪽
        // 왼쪽에 있는게 오른쪽에 들갈수있으면 true
        //부모는 자식담을수있고 자식은 부모담을수없음
        //ex) parent는 child에 못들가지만 (false) child 는 parent에 들갈수있음 true
        if (parent instanceof Child) {
            System.out.println("Child 인스턴스 맞음");
            Child child = (Child) parent;
            child.childMethod();
        }
//        else {
//            System.out.println("Child 인스턴스 아님");
//        }
    }
}
