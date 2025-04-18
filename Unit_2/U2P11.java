package Unit_2;

public class U2P11 {
    public int num1, num2;
    public U2P11(){
        num1 = 10;
        num2 = 20;
    }
    public void incrementDecrement(){
        System.out.println("Before increment num1 = " + num1);
        num1++;
        System.out.println("After increment num1 = " + num1);

        System.out.println("Before decrement num2 = " + num2);
        num2--;
        System.out.println("Before decrement num2 = " + num2);
    }
}
