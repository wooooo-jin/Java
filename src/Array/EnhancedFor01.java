package Array;

public class EnhancedFor01 {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5};

        //일반 for문
//        for(int i=0; i<numbers.length; i++){
//            int number = numbers[i];
//            System.out.println(number);
        // 향상된 for문
            for(int number : numbers){   // number는 for문 안에서 들었음 밖에서 못사용
                System.out.println(number);
            }

        }
    }

