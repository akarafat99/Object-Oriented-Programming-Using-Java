package Unit_10;

public class TryCatchFinally {
    public static void main (String args[]) {
        try {
            System.out.println ("Try Block");
            int data = 1 / 0;
            System.out.println ("Result:" + data);
        }
        catch (Exception e) {
            System.out.println ("Catch Block");
            System.out.println (e);
        }
        finally {
            System.out.println ("Finally Block");
        }
        System.out.println ("The code line after try-catch-finally");
    }
}
