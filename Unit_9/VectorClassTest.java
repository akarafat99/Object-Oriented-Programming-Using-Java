package Unit_9;
import java.util.*;
public class VectorClassTest {
    public static void main(String[] args){
        Vector<Integer> vec = new Vector<Integer>();
        vec.add(10);
        vec.add(20);
        vec.add(30);
        System.out.println("Size of vector after several add: "+vec.size());

        System.out.println("Elements in vector");
        int i;
        for(i=0 ; i< vec.size() ; i++){
            System.out.println("vec["+i+"] = "+vec.elementAt(i));
        }

        vec.removeElementAt(1);
        System.out.println("Elements in vector after 1 element remove");
        for(i=0 ; i< vec.size() ; i++){
            System.out.println("vec["+i+"] = "+vec.elementAt(i));
        }
    }
}
