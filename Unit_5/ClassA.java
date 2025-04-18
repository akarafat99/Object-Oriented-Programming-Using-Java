package Unit_5;

public class ClassA extends BaseClass{
    private int num1, num2;
    public ClassA(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public void debugMsg(){
        System.out.println("num1 = "+num1+" num2="+num2);
    }
}
