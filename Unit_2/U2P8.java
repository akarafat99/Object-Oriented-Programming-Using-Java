package Unit_2;

public class U2P8 {
    public double num[] = new double[5];
    public double temp[] = new double[3];
    public U2P8(int a, int b, int c){
        num[0] = a;
        num[1] = b;
        num[2] = c;
        num[3] = (b*b) - 4*a*c;
        num[4] = (2*a);
    }
    public void root(){
        if(num[3]<0){
            //For complex number
            temp[0] = -num[1]/num[4];
            temp[1] = Math.sqrt((-1)*num[3]) / num[4];
            System.out.println("Root 1: "+temp[0] + " + i" + temp[1]);
            System.out.println("Root 2: "+temp[0] + " - i" + temp[1]);
        }
        else{
            temp[2] = Math.sqrt(num[3]);
            temp[0] = (-num[1]+temp[2])/num[4];
            temp[1] = (-num[1]-temp[2])/num[4];
            System.out.println("Root 1: "+ temp[0] + " Root 2: " + temp[1]);
        }
    }
}
