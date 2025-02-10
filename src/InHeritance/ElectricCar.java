package InHeritance;

public class ElectricCar extends Car{
//    public void move() {
//        System.out.println("이동합니다.");
//    }
    //언오테이션 오버라이드 했다고 표시
    @Override
    public void move(){
        System.out.println("매우 빠르게 이동");
    }


    public void charge() {
        System.out.println("충전합니다.");
    }
}
//오버라이딩은
// 매서드 이름같고 시그니처 같고 반환타입같고 접근제어자 같아
// 범위가 같거나 커야함 부모클래스보다는 커야함.
// 재정 기능 바꿈, 추가 부모한테 받은거 쓰고

//다항식 값이 여러가지이다.
// 부모클래스의 참조값이 객
//부모 클래스 타입의 참조 변수가 자식 클래스 타입의 객체를 참조할 수 있는 특징을 가짐.