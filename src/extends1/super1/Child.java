package extends1.super1;


public class Child extends Parent {
    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    public void call() {
        System.out.println("this value = " + this.value);//this생략가능 자기에서 없으면 부모에서 찾음
        System.out.println("super vaeue = " + super.value);//부모에서찾기
        this.hello();
        super.hello();
    }
}
