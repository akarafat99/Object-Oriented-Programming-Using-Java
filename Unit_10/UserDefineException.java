package Unit_10;

public class UserDefineException {
    public int areaSquare(int length) throws NegativeLengthException{
        if(length<0){
            throw new NegativeLengthException();
        }
        int area = length*length;
        return area;
    }
}
