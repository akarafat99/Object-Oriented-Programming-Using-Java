package Unit_2;

public class U2P33 {
    public int arr[][], rowSize, colSize;
    public U2P33(){
        rowSize = 3;
        colSize = 2;
        arr = new int[rowSize][colSize];
        arr[0][0] = 10;
        arr[0][1] = 20;
        arr[1][0] = 30;
        arr[1][1] = 40;
        arr[2][0] = 50;
        arr[2][1] = 60;
    }
    public void twoDArray(){
        int i, j;
        for(i=0 ; i<rowSize ; i++){
            for(j=0 ; j<colSize ; j++){
                System.out.println("arr[" + i +"]" + "[" + j + "] = " + arr[i][j]);
            }
        }
    }
}
