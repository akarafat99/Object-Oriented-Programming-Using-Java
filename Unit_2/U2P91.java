package Unit_2;

public class U2P91 {
    public int arr1[][] = { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
    public int arr2[][] = { {13, 14, 15, 16}, {17, 18, 19, 20}, {1, 2, 3, 54}};
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
    public void matAddition(){
        System.out.println("Output of matrix addition");
        int i, j;
        for(i=0 ; i<arr1.length ; i++){
            for(j=0 ; j<arr1[0].length ; j++){
                System.out.print(arr1[i][j]+arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
