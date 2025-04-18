package Unit_4;

public class Square extends Shape{
    public int length;
    public Square(String color, int length){
        super(color);
        this.length = length;
    }
    public void displaySquare(){
        System.out.print("Length: "+length+" ");
        super.displayShape();
    }
}
