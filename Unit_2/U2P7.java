package Unit_2;

public class U2P7 {
    public int arr[] = {10, 33, 22, 55, 15, 2, 8}, i, j, tmp;
    public U2P7(){
    }
    //Implemented - Bubble sort algorithm
    public void ascendSort(){
        for(i=0 ; i<arr.length ; i++){
            for(j=0 ; j<(arr.length - i - 1) ; j++){
                if(arr[j]>arr[j+1]){
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
    public void displayArray(){
        for(i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
