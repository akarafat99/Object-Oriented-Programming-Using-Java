package Unit_4;

public class Inherit {
    public static void main(String[] args){
        A a = new A();
        B b = new B();

        a.number1 = 10;
        a.number2 = 20;
        a.displayNumbers();

        b.number = 100;
        b.number1 = 200;
        b.number2 = 300;
        b.displayNumber();
    }
}
