package Unit_2;

public class U2P61 {
    public int num, i, ans=1;
    public U2P61(){
        num = 123;
    }
    public U2P61(int num){
        this.num = num;
    }
    public int primeChecker(){
        for(i=2 ; i<=Math.sqrt(num) ; i++) {
            if (num % i == 0) {
                ans = 0;
                break;
            }
        }
        return ans;
    }
}
