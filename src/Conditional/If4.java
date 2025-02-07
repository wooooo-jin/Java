package Conditional;
// 여러개중에 '하나'에 속하는 것 다중
public class If4 {
    public static void main(String[] args){
        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000){
            discount = discount + 1000;
            System.out.println(price + "원 이상 구매" + discount + "원 할인");
        }
        if (age <= 10){ //10살 이하면
            discount = discount + 1000;
            System.out.println("어린이" + discount + "원 할인");
        }
        System.out.println("총 할인금액: " + discount + "원");
    }
}
