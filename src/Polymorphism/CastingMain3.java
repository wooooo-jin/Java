package Polymorphism;

public class CastingMain3 {
    public static void main(String[] args) { // 메인이 늘 먼저 실행됨.
        Parent parent = new Parent();  //1. 그냥 부모 // 참조안함
        System.out.println("parent 호출"); //
        call(parent);

        Parent parent1 = new Child(); // 업캐스팅 // 업캐스팅을 해서 부모가 자식의 인스턴스를 참조함
        System.out.println("Parent1 호출");
        call(parent1);

    }
    private static void call(Parent parent){
     //   parent.parentMethod();
        if (parent instanceof Child){ // 참조를 하면 실행 근데 1번은 그냥 자기 자신임. // 2. 참조를해서 실행
            System.out.println("Child 인스턴스 맞음");
            Child child = (Child) parent;
   //         child.childMethod();
        }
    }
}
