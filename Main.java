import MyPack.Circle;
import P1.SampleClass1;
import Unit_2.*;
import Unit_3.Modifier;
import Unit_3.Room;
//import Unit_4.*;
import Unit_5.*;
import Unit_5.Square;
import Unit_8.*;
import Unit_8.Number;
import MyPack.*;
import Unit_10.*;
import revise.*;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car("Vfx", 100);
//        car.display();
//        System.out.println(car.passKey());
//
//        Car1 car1 = new Car1("Arafat", 200);
//        //car1.val
//        car1.display();


        System.out.println("1. Call by value");
        int number = 10;
        Modifier modifier1 = new Modifier();
        System.out.println("Before: " + number);
        modifier1.modifier(number);
        System.out.println("After : " + number);

        System.out.println("2. Call by reference");
        Modifier modifier2 = new Modifier();
        modifier2.number1 = 100;
        System.out.println("Before: " + modifier2.number1);
        modifier1.modifier(modifier2);
        System.out.println("After: " + modifier2.number1);


    }
}