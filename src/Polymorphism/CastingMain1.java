package Polymorphism;

import InHeritance.Child;
import InHeritance.Parent;

public class CastingMain1 {
    public static void main(String[] args) {
        InHeritance.Child child = new Child();
   //     Parent parent = (Parent) child; // 업스캐이
        Parent parent1 = child;
    }
}
