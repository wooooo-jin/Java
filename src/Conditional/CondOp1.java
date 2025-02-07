package Conditional;
// 삼랑 연산자
public class CondOp1 {
    public static void main(String[] args){
       int age = 18; //18살 이상이면
       String status = (age >= 18) ? "성인" : "미성년자";
       System.out.println(status);
    }
}
