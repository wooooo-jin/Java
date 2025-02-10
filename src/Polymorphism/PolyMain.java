package Polymorphism;
// child 를 생성하면 부모와 child 가 생성
// 부모타입은 차일드를 통해서 만든 차일
// 타입 부모 인스턴스 차일드 // 부모는 자식의 타입을 담을 수 있다. // 참조값을 가질수 있다.
// 자식은 안됨.
public class PolyMain {
    public static void main(String[] args) {
        // (1) 부모 타입의 변수가 부모 인스턴스를 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        //parent.parentMethod(); // 정상 호출

        // (2) 자식 변수가 자식 인스턴스를 참조하는 상황
        System.out.println("Child -> Child");
        Child child = new Child();
       // child.parentMethod();  // 부모 메서드 호출 가능 (상속)
      //  child.childMethod();   // 자식 메서드 호출 가능

        // (3) 부모 타입의 변수가 자식 인스턴스를 참조 (다형적 참조) // 업캐스팅
        System.out.println("Parent -> Child");
        Parent poly = new Child(); // 차일드 인스턴스 생성 타입은 부모 //업캐스팅.
       // poly.parentMethod(); // 부모 메서드 호출 가능

        Child child1 = (Child)poly; // 다운캐스팅 이건 올바른 코딩이 아님.


        // poly.childMethod();  // 컴파일 오류 (자식 메서드 직접 호출 불가)

        // Child polyChild = new parent;
        //
    }
}

