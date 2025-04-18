package Unit_9;

public class Box3d extends Box{
    public int height;
    public Box3d(){
        super();
        height = 1;
    }
    public Box3d(int length, int breadth, int height){
        super(length, breadth);
        this.height = height;
    }

    public void setValue(int length, int breadth, int height){
        super.setValue(length, breadth);
        this.height = height;
    }
    public int getVolume(){
        return (height*super.getArea());
    }
    public void displayValues(){
        System.out.println("Length: "+length+" Breadth: "+ breadth+" Height: "+height);
    }
}
