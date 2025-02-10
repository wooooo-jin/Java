package InHeritance;

public class CarMain { //car 이라는 개념에 전기차 가스차가있음.
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move(); // 부모클래스가 가지고 있는 매서드.
        electricCar.charge();
        electricCar.openDoor();


        GasCar gascar = new GasCar();
        gascar.move();
        gascar.fillUp();
        gascar.openDoor();


        Hydrogen hydrogen = new Hydrogen();
        hydrogen.fillHydDoge();
        hydrogen.openDoor();

    }
}
