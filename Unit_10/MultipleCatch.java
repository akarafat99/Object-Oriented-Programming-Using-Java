package Unit_10;

public class MultipleCatch {
    public static void main(String[] args){

        try{
            int a[] = new int[3];
            System.out.println(a[10]);
        }
        catch(ArithmeticException e1){
            System.out.println(e1);
        }
        catch (ArrayIndexOutOfBoundsException e2){
            System.out.println(e2);
        }
        catch (Exception e3){
            System.out.println(e3);
        }
        System.out.println("End of the code");
    }
}
