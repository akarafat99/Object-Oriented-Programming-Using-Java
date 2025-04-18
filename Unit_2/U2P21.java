package Unit_2;

public class U2P21 {
    public int num1, num2, num3;
    public U2P21(){
        num1 = 100;
        num2 = num1/2;
        num3 = num1+num2;
    }
    public void ifStatement(){
        if(num1 > (num2+num3)){
            System.out.println("Hello JUST");
        }
        if(num3 > num1) {
            System.out.println("Hello JUST'ians");
        }
        if(num3 > (num1+(num3%num2)*num2)){
            System.out.println("Hello World!");
        }
    }
}
