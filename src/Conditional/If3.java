package Conditional;
 // 여러개중에 '하나'에 속하는 것 다중
public class If3 {
    public static void main(String[] args){
        int age = 14;

        if (age <= 7){
            System.out.println("미취학");
        } else if (age <= 13) {// 이하 범위.
            System.out.println("초등학생");
        }  else if (age <=16){
            System.out.println("중학생");
        } else if (age <=19){
            System.out.println("고등학생");
        }
    }
}
