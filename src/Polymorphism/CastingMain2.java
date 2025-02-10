package Polymorphism;

import InHeritance.Child;
import InHeritance.Parent;

public class CastingMain2 {
    public static void main(String[] args) {
        InHeritance.Parent parent = new InHeritance.Child(); //업캐스팅  // 부모 타입의 1.자식 인스턴스 생성 2. 부모 인스턴스도
        InHeritance.Child child = (InHeritance.Child) parent; // 다운캐스팅
        child.childMethod(); // 문제없음
        
        InHeritance.Parent parent1 = new Parent(); // 부모타입의 부모 생성
        // 피해야 하는 에러
        InHeritance.Child child1 = (Child) parent1; //ClassCastException 컴파일에 문제는 없다. 실행문제
        child1.childMethod();
    }
}
