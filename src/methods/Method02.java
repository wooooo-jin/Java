package methods;

public class Method02 {
    public static void main(String[] args) {
        printHeader();
        System.out.println("==프로그램 동작==");
        printFooter();
    }
    public static void printHeader() { // 리턴이 없고 void 매게변수가 없다()
        System.out.println("==프로그램시작==");
        return;
    }
    public static void printFooter(){
        System.out.println("==프로그램 종료==");
    }
}
