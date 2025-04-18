package Unit_4;
import Unit_3.*;

public class Home extends Room {
    public String homeName;
    public Home(){
        homeName = "None";
    }
    public Home(String homeName){
        this.homeName = homeName;
    }
    public void displayHomeData(){
        System.out.println("Home name: " + homeName);
        super.displayData();
    }
}
