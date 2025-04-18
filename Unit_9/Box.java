package Unit_9;

public class Box {
    public int length, breadth;
    public Box(){
        length = 1;
        breadth = 1;
    }
    public Box(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public void setValue(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public int getArea(){
        return (length*breadth);
    }
}
