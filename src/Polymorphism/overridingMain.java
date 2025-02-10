package Polymorphism;

public class overridingMain {
    public static void main(String[] args) {
        // 자식변수가 자식 인스턴스 참조
        Child child = new Child(); // 선언 생성
        System.out.println("Child->Child");
        System.out.println("value= " + child.value); //child

        // 부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent->Parent");
        System.out.println("value= "+parent.value); // parent

        //부모 변수가 자식 인스턴스를 참조(다향성 참조)
        Parent poly = new Child(); // 부모 타입에 넣었으니
        System.out.println("Parent->Child");
        System.out.println("value= "+poly.value); // parent
        poly.method(); // parent.method -> child.method  // 부모도 자식을 참조해서 사용

        //System.out.println(poly.value);  // "parent" (변수는 오버라이딩되지 않음)
        //poly.method();  // "Child.method" (메서드는 오버라이딩됨)
    }
}
