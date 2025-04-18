package Unit_2;

public class U2P41 {
    public static void main(String[] args){
        int sum, invalidInt, i;
        sum = invalidInt = 0;
        for(i=0 ; i<args.length ; i++){
            try{
                sum += Integer.parseInt(args[i]);
            }
            catch(Exception e){
                invalidInt++;
            }
        }
        System.out.println("Sum of valid interger = " + sum);
        System.out.println("Number of invalid integer(s) = " + invalidInt);
    }
}
