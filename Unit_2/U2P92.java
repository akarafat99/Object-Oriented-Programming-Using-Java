package Unit_2;

public class U2P92 {
    public int arr1[][] = { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
    public int arr2[][] = { {13, 14, 15}, {17, 18, 19}, {1, 2, 3}, {10, 20, 30}};
    public int arr3[][] = new int[arr1.length][arr2[0].length];
    public void displayGivenMats(){
        System.out.println("Given matrix 1");
        for(int i=0 ; i<arr1.length ; i++){
            for(int j=0 ; j<arr1[0].length ; j++){
                System.out.print(arr1[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("Given matrix 2");
        for(int i=0 ; i<arr2.length ; i++){
            for(int j=0 ; j<arr2[0].length ; j++){
                System.out.print(arr2[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public void matMultiplication(){
        System.out.println("Output after matrix multiplication");
        int i, j, k, sum = 0;
        for(i=0 ; i<arr1.length ; i++){
            for(j=0 ; j<arr2[0].length ; j++){
                sum = 0;
                for(k=0 ; k<arr1[0].length ; k++){
                    sum += (arr1[i][k] * arr2[k][j]);
                }
                arr3[i][j] = sum;
            }
        }
        for(i=0 ; i<arr1.length ; i++){
            for(j=0 ; j<arr2[0].length ; j++){
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
