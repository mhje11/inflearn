package poly.ex4;

public class AbstractMain {
    public static void main(String[] args) {
//        AbstractAnimal abstractAnimal = new AbstractAnimal();
        //추상클래스 생성불가

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(cow);
        moveAnimal(dog);
        moveAnimal(cat);
        moveAnimal(cow);
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
        System.out.println();
    }

    private static void moveAnimal(AbstractAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 종료");
        System.out.println();
    }
}
