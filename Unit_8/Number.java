package Unit_8;

public class Number {
    private double number;
    private int number1;
    public Number(){
    }
    public Number(double number, int number1){
        this.number = number;
        this.number1 = number1;
    }
    public boolean isZero(){
        if(number==0){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isPositive(){
        if(number<=0.0){
            return false;
        }
        else{
            return true;
        }
    }
    public boolean isNegative(){
        if(number<0.0){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isOdd(){
        if(number%2 == 0){
            return false;
        }
        else{
            return true;
        }
    }
    public boolean isEven(){
        if(number%2 == 1){
            return false;
        }
        else{
            return true;
        }
    }
    public boolean isPrime(){
        int i, lmt;
        lmt = (int) Math.sqrt(number);
        boolean ans = true;
        for(i=2 ; i<=lmt ; i++){
            if(number%i == 0){
                ans = false;
                break;
            }
        }
        return ans;
    }
    public boolean isAmstrong(){
        if(number == 0.0){
            return true;
        }
        else{
            return false;
        }
    }

    public double getFactorial(){
        double i, ans=1;
        i = number1;
        while(i>1){
            ans *= i;
            i--;
        }
        return ans;
    }
    public double getSqrt(){
        return (Math.sqrt(number));
    }
    public double getSqr(){
        double ans = (number*number);
        return ans;
    }
    public double sumDigits(){
        int number1 = (int)number, ans=0;
        while(number1!=0){
            ans += number1%10;
            number1 /= 10;
        }
        double ans1 = (double) ans;
        return ans1;
    }
    public double getReverse(){
        int ans=0, num=(int)number;
        while(num != 0){
            ans = (ans*10) + (num%10);
            num /= 10;
        }
        double ans1 = (double) ans;
        return ans1;
    }

    public void listFactor(){
    }
    public void displayBinary(){
        long number2 = (long) number;
        System.out.println("Binary: "+Long.toBinaryString(number2));
    }

}
