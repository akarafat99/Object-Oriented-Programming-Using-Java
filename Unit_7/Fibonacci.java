package Unit_7;

public class Fibonacci {
    int findFibo(int num1, int num2, int cnt, int limit){
        if(cnt == limit){
            return num2;
        }
        else{
            cnt++;
            return (findFibo(num2, (num1+num2), cnt, limit));
        }
    }
    public static void main(String[] args){
        int num = 7, ans;
        Fibonacci f = new Fibonacci();
        if(num<3){
            ans = 2;
        }
        else{
            ans = f.findFibo(1, 1, 2, num);
        }
        System.out.println(num+" no fibonacci number is "+ans);
    }
}
