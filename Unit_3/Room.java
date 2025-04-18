package Unit_3;

public class Room {
    public int roomNo;
    public String roomType;
    public double roomArea;
    public boolean ACmachine;
    public void setData(int roomNo, String roomType, double roomArea, boolean ACmachine){
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.roomArea = roomArea;
        this.ACmachine = ACmachine;
    }
    public void displayData(){
        System.out.println("Room No: " + roomNo);
        System.out.println("Room Type: " + roomType);
        System.out.println("Room Area: " + roomArea);
        System.out.print("Room ACmachine: ");
        if(ACmachine == true) {
            System.out.println("Available");
        }
        else{
            System.out.println("Unavailable");
        }
    }
}
