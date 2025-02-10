package Polymorphism;

import InHeritance.Child;
import InHeritance.Parent;

public class CastingMain {
    public static void main(String[] args) {
        // 업캐스팅 / 부모 타입의 변수가 자식인스턴스를 참조.
        Parent poly = new InHeritance.Child();

//        poly.childMethod(); // 부모는 이게 차일드 메서드인지 모름.
        // 일시적 다운캐스팅
        ((Child) poly).childMethod(); // 연산자 우선순위가 먼저임

    }
}
