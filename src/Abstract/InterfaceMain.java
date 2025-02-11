package Abstract;

public class InterfaceMain {
    public static void main(String[] args) {
        InterfaceA a = new InterfaceChild();
        a.methodA();
        a.methodCommon();

        InterfaceB b = new InterfaceChild();
        b.methodB();
        b.methodCommon();
    }
}
// 오버라이딩 된걸 사용함.
// 제약이 있어야함.
// new 는 인스턴스 생성
// 추상 클래스 : 상속을 목적으로 부모 클래스 역할
// public abstract class AbstractAnimal { ... }
// 추상 메서드는 바디가 없다. public abstract void sound();


//상속
//부모가 자식에게 상속 멤버변수,메소드 사용.

// 다형성
// 코드의 다형성은 유연하게 사용하기위해서 사용
// 객체지향 캡슐화(프라이빗,데이터 묶음)
// 클래스,상속,추상화,다형성
// 부모클래스 만들고 오버라이딩 해준다.