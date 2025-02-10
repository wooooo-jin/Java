package InHeritance;

public class Car {
    public void move(){ //부모클래스
        System.out.println("이동");
    }
    public void openDoor(){
        System.out.println("문열림");
    }
}
// 오버로드 쌓아나간다. 함수 파라미터의 타입과 개수(시그니처)
// 오버라이딩 재정의. 부모의 상속을 무시