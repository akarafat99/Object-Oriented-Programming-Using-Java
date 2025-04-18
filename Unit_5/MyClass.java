package Unit_5;

public class MyClass implements A{
    @Override
    public int meth1(int num1, int num2) {
        System.out.println("Sum of "+ num1 + " and " + num2);
        return (num1+num2);
    }
    @Override
    public double meth2(int num1, int num2) {
        System.out.println("Division of "+ num1 + " and " + num2);
        return ((double) num1/num2);
    }
    public void display(){
        System.out.println("meth1: "+meth1(10, 20));
        System.out.println("meth2: "+meth2(20, 16));
    }
}
