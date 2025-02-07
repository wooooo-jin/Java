package methods;

public class Method01 {
    public static void main(String[] args){ //main 함수
        // 1. 메서드 호출
        int result1 = add(5, 10);
        // 메서드 호출 :  add(5,10) 호출할 때 5, 10는 아규먼트 (인자)
        // int result1 = 15
        System.out.println(result1);

        int result2 =  add(20,5);
        System.out.println(result2);
    }
    // 메서드(함수)
    // 이름뒤에 매개변수를 넣어주면 매서드 호출.
    // public static int add(int a, int b) : 메서드 선언
    // public : 다른 클래스에서 호출할 수 있는 메서드
    // static : 객체를 생성하지 않고 호출할 수 있는 (정적)메서드.
    // int(type) : 반환 타입 / 어떤 타입의 메서드를 반환
    // add(int a, int b) : 시그니처  / 이름은 같아도 타입,순서가 다르면 가능
    // add : 매서드의 이름
    // (int a, int b) : 매개변수(parameter) 메서드를 호출할때 필요한 값 (연결해주는

    // {..} : 메서드 본문
    // return : 메서드의 반환 결과


    public static int add(int a, int b){ // 메서드 선언

        System.out.println(a+"+"+b+"+"+(a+b)); // {..} 메서드 본문
        int sum = a + b;
        return sum;
    }
}

// 1: 메서드 호출
//int sum1 = add(5, 10);   인자
//
// 2: 파라미터 변수 a=5, b=10 전달 후 메서드 실행
//public static int add(int a=5, int b=10) {  파라미터
//    int sum = a + b;
//    return sum;
//}
//
// 3: 실행 후 연산 수행
//int sum = 5 + 10; // sum = 15
//return 15;
//
// 4: 반환된 값이 sum1 변수에 저장
//int sum1 = 15;