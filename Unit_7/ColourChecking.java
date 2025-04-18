package Unit_7;
import java.awt.*;
public class ColourChecking
{
    public static void main(String arg [ ])
    {
        float hsbValue[] = new float[3];
        System.out.println("For RGB: 193, 255, 183");
        hsbValue = Color.RGBtoHSB(193, 255, 183, hsbValue);
        System.out.println("Hue = "+ hsbValue[0]);
        System.out.println("Saturation = "+ hsbValue[1]);
        System.out.println("Brightness = "+ hsbValue[2]);
    }
}