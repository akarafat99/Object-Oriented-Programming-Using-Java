package Unit_4;

public class demonstrateStatic {
    public static int count=0;
    public static int a = 10;
    static {
        System.out.println("Static block executed");
        a = count+1;
    }
    public static void incrementMethod(){
        count += 1;
        System.out.println("Count = " + count);
        System.out.println("a = " + a);
    }
}
