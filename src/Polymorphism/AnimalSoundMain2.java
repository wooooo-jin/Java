package Polymorphism;

public class AnimalSoundMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog(); // 슈퍼클래스를 가지고있는 서브 클래스 ( 부모를 가지고있는 자식들)
        Cat cat = new Cat();
        Cow cow = new Cow();
        Animal[] animals = {dog, cat, cow};

        for (Animal ani : animals) {
            System.out.println("동물 소리 테스트 시작");
            ani.sound();
            System.out.println("동물 소리 테스트 종료");
        }
    }
}
