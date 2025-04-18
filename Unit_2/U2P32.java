package Unit_2;

public class U2P32 {
    public int arr[], size;
    public U2P32(){
        size = 5;
        arr = new int[size];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
    }
    public void oneDArray(){
       int i;
       for(i=0 ; i<size ; i++){
           System.out.println("arr[" + i +"] = " + arr[i]);
       }
    }
}
