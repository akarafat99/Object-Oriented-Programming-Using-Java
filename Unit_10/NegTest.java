package Unit_10;

public class NegTest {
    public static void main(String[] args){
        try{
            int a1[] = new int[-10];
            System.out.println("No negative found");
        }
        catch (Exception e){
            System.out.println("Exception error found: "+ e);
        }
    }
}
