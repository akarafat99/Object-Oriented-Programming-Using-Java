package Unit_2;

public class U2P12 {
    public int number;
    public U2P12(){
        number = 15;
    }
    public void bitWiseComplementOperator(){
        System.out.println(number);
        number = ~number;
        System.out.println("After complement: " + number);
    }
}
