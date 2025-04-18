package Unit_2;

public class U2P52 {
    public int row, start, i, j;
    public U2P52(){
        row = 5;
    }
    public void display(){
        for(i=0 ; i<=row ; i++){
            start = row-i;
            for(j=start ; j<=row ; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
