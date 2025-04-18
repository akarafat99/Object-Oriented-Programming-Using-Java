package Unit_2;

public class U2P16 {
    public int num1, num2;
    public U2P16(){
        num1 = 100;
        num2 = 40;
    }
    public void conditionalOperators(){
        System.out.println((num1>0) && (num2>num1));
        System.out.println( ((num1-num2)<10 || (num1>num2)) );
    }
}
