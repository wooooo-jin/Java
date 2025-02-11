package Abstract;

public class AbstractMain {
    public static void main(String[] args) {
//        AbstractAnimal abstractAnimal = new AbstractAnimal();

        Dog dog = new Dog(); // 슈퍼클래스를 가지고있는 서브 클래스 ( 부모를 가지고있는 자식들)
        Cat cat = new Cat();
        Cow cow = new Cow();
        Bird bird = new Bird();

        bird.fly();
        bird.move();
        bird.sound();


        dog.move();

        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(cow);

        moveAnimal(dog);
        moveAnimal(cow);
        moveAnimal(cat);

    }
// 순수 추상은 다형성
    public static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");


    }
    public static void moveAnimal(InterfaceAnimal animal) {
        System.out.println("동물 걸음 소리 테스트 시작");
        animal.move();
        System.out.println("동물 걸음 소리 테스트 종료");


    }
}
// 제약이 있어야함.
// new 는 인스턴스 생성
// 추상이란? 다형성 참조를 하기위한 클래스는 추상클래스
// 추상 클래스 : 상속을 목적으로 부모 클래스 역할 실제가 없는 개념적
// public abstract class AbstractAnimal { ... }
// 추상 메서드는 바디가 없다. public abstract void sound(); 반드시 오버라이드
// 추상 메스드만 있으면 순수추상

//인터페이스는 상속 여러가지바드다중구현

//상속
//부모가 자식에게 상속 멤버변수,메소드 사용.

// 다형성
// 코드의 다형성은 유연하게 사용하기위해서 사용
// 객체지향 캡슐화(프라이빗,데이터 묶음)
// 클래스,상속,추상화,다형성
// 부모클래스 만들고 오버라이딩 해준다.

// 인터페이스 : 규격  / 사용자가 사용하는 모양
