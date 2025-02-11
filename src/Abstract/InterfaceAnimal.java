package Abstract;
// 인터페이스
public interface InterfaceAnimal {
    double MY_PI = 3.14; //public static final
    // 인터페이스에서 선언한 멤버변수는 public static final 


    void sound(); //interface 사용하면 public abstract 생략
    void move();
}
// 제약이 있어야함.
// new 는 인스턴스 생성
// 추상이란?
// 추상 클래스 : 상속을 목적으로 부모 클래스 역할
// public abstract class AbstractAnimal { ... }
// 추상 메서드는 바디가 없다. public abstract void sound();
// 순수 추상은 없는거임

//상속
//부모가 자식에게 상속 멤버변수,메소드 사용.

// 다형성
// 코드의 다형성은 유연하게 사용하기위해서 사용
// 객체지향 캡슐화(프라이빗,데이터 묶음)
// 클래스,상속,추상화,다형성
// 부모클래스 만들고 오버라이딩 해준다.

// 인터페이스 : 규격  / 사용자가 사용하는 모양