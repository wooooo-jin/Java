package InHeritance;
// 자식클래스          //  부모클래스 상속
public class Child extends Parent {
    public String value = "Child"; //this 는 멤버변수

    @Override
    public void hello(){
        System.out.println("Child.hello");
    }

    public void call(){
        System.out.println("this value ="+this.value);
        System.out.println("super value =" + super.value);

        this.hello();
        super.hello();
    }

    public void childMethod() {

    }
}
// 생성자는 오버라이딩 불가능
// 생성자는 클래스 이름과 같아야 하니까 반드시 하나.
// 내 생성자 안에 부모 생성자를 넣어줘라 extends