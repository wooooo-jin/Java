package InHeritance;

public class ClassB extends ClassA{
    public ClassB(int a){
//        super(); //A의 상속을 의미함.
//        파라미터가(매개변수) 없으면 없어도 됨 그래서 주석처리함
        System.out.println("ClassB.ClassB" +a);
    }

    public ClassB(int a,int b){
        super();
        System.out.println("ClassB.ClassB: " + a+b); // 10+20

    }
}
