package Unit_8;

public class Point {
    private int x, y;
    public Point(){
    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void display(){
        System.out.println("x: "+x+" y: "+y);
    }
}
