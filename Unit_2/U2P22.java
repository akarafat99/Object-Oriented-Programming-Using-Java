package Unit_2;

public class U2P22 {
    public char s1;
    public U2P22(){
        s1 = 'A';
    }
    public U2P22(char s1){
        this.s1 = s1;
    }
    public void switchCaseStatements(){
        switch (s1){
            case 'l':
                System.out.println("Found l");
                break;
            case 'A':
                System.out.println("Found A");
                break;
            default:
                System.out.println("Default case");
        }
    }
}
