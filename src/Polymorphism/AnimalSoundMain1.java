package Polymorphism;

public class AnimalSoundMain1 {
    public static void main(String[] args) {
        Dog dog = new Dog(); // 슈퍼클래스를 가지고있는 서브 클래스 ( 부모를 가지고있는 자식들)
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(cow);

    }
    public static void soundAnimal(Animal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");



    }

}
