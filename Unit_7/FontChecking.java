package Unit_7;
import java.awt.*;
public class FontChecking {
    public static void main(String[] args){
        Font f1;
        f1 = new Font("TimesNewRoman", Font.ITALIC+Font.BOLD,12);
        String font = f1.getName();
        int style = f1.getStyle();
        int size = f1.getSize();
        boolean bold = f1.isBold();
        boolean italic = f1.isItalic();
        boolean plain = f1.isPlain();

        System.out.println("Font: "+font);
        System.out.println("Style: "+style);
        System.out.println("Size: "+size);
        System.out.println("Bold: "+bold);
        System.out.println("Italic: "+italic);
        System.out.println("Plain: "+plain);
    }
}
