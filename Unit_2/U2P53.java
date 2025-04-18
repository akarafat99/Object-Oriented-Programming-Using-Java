package Unit_2;

public class U2P53 {
    public int row, start, i, j;
    public U2P53(){
        row = 5;
    }
    public void display(){
        for(i=0 ; i<row ; i++){
            start = i+1;
            for(j=1 ; j<=start ; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
