package Unit_10;

public class NegativeLengthException extends Exception{
    @Override
    public String toString(){
        return "Length can not be negative";
    }
    @Override
    public String getMessage(){
        return "Length can not be negative";
    }
}
