package Unit_2;

public class U2P51 {
    public int num, i, j, row, col;
    public U2P51(){
        num = 1;
        row = 5;
    }
    public void display(){
        for(i=1 ; i<=row ; i++){
            col = (i*2)-1;
            for(j=0 ; j<col ; j++){
                if(j==0){
                    System.out.print(1);
                }
                else if(j == col-1){
                    System.out.print(" 1");
                }
                else{
                    System.out.print(" 0");
                }
            }
            System.out.println();
        }
    }
}
