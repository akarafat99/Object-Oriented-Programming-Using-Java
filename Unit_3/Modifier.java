package Unit_3;

public class Modifier {
    public int number1;
    public void modifier(int number){
        System.out.println("In modifier method - before: " + number);
        number += 10;
        System.out.println("In modifier method - after: " + number);
    }
    public void modifier(Modifier m1){
        System.out.println("In modifier method - before: " + m1.number1);
        m1.number1 += 10;
        System.out.println("In modifier method - after: " + m1.number1);
    }
}
