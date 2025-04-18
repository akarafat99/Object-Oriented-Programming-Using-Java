package Unit_2;

public class U2P24 {
    public int num1, num2;
    public U2P24(){
        num1 = 1;
        num2 = 5;
    }
    public void whileStatement(){
        while(num1<=num2){
            if(num1%2 == 0){
                System.out.println(num1 + " is even");
            }
            else {
                System.out.println(num1 + " is odd");
            }
            num1++;
        }
    }
}
