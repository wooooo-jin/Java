package methods;

public class Method03 {
    public static void main(String[] args) {
        boolean result = odd(3); // 인수 ()
        System.out.println(result);
    }
    public static boolean odd(int i){ // 짝수에 대한 리턴을 만들어줘야함
        if(i%2==1) {
            return true;
        } else {
            return false; //리턴을 보내면 함수를 실행하지않는다.
        }
    }
}
