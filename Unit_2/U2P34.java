package Unit_2;

public class U2P34 {
    int size[] = new int[3];
    int arr[][][];
    public U2P34(){
        size[0] = 2;
        size[1] = 1;
        size[2] = 3;
        arr = new int[size[0]][size[1]][size[2]];
        int tmp = 1;
        arr[0][0][0] = 10*(tmp++);
        arr[0][0][1] = 10*(tmp++);
        arr[0][0][2] = 10*(tmp++);
        arr[1][0][0] = 10*(tmp++);
        arr[1][0][1] = 10*(tmp++);
        arr[1][0][2] = 10*(tmp++);
    }
    public void multiDArray(){
        int i, j, k;
        for(i=0 ; i<size[0] ; i++){
            for(j=0 ; j<size[1] ; j++){
                for(k=0 ; k<size[2] ; k++){
                    System.out.println("arr[" + i +"]" + "[" + j + "]" + "[" + k + "] = " + arr[i][j][k]);
                }
            }
        }
    }
}
