package Unit_2;

public class U2P62 {
    public int num, sum;
    public U2P62(){
        num = 0;
    }
    public U2P62(int num){
        this.num = num;
    }
    public int sumOfDigitsOfNum(){
        sum = 0;
        while(num!=0){
            sum += num%10;
            num /= 10;
        }
        return sum;
    }
}
