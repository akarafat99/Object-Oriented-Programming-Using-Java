package Unit_7;

public class Problem731 {
    int f(int n){
        if(n<=1){
            return 1;
        }
        else{
            return(n*f(n-1));
        }
    }
    public static void main(String[] args){
        int num1, num2, num3, num11, num22, num33;
        num1 = 2;
        num2 = 3;
        num3 = 5;
        Problem731 p = new Problem731();
        num11 = p.f(num1);
        num22 = p.f(num2);
        num33 = p.f(num3);
        System.out.println("Factorial of "+num1+"="+num11);
        System.out.println("Factorial of "+num2+"="+num22);
        System.out.println("Factorial of "+num3+"="+num33);
    }
}
