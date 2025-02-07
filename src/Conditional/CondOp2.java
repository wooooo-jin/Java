package Conditional;

public class CondOp2 {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 20;
        int max = (num1 > num2) ? num1 : num2;
        System.out.println("더 큰 수: " + max);
    }
}
