package Unit_1;

public class U1P3 {
    public String s1;
    public String s2;

    public U1P3(){
        s1 = "CSE club";
        s2 = "CSE Club";
    }
    public U1P3(String s1, String s2){
        this.s1 = s1;
        this.s2 = s2;
    }

    public void stringMatch(){
        if(s1 == s2){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }
    }
}
