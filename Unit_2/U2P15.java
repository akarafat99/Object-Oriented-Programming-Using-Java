package Unit_2;

public class U2P15 {
    public int num1, num2;
    public U2P15(){
        num1 = 103;
        num2 = 23;
    }
    public void bitwiseOperators(){
        System.out.println("Numbers are: " + num1 + " " + num2);
        System.out.println("Left shift of " + num1 + " is " + (num1<<2) );
        System.out.println("Right shift of " + num1 + " is " + (num1>>2) );
        System.out.println("AND of " + num1 + " and " + num2 + " is " + (num1&num2) );
        System.out.println("OR of " + num1 + " and " + num2 + " is " + (num1^num2) );
    }
}
