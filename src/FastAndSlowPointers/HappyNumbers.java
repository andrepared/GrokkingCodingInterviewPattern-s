package FastAndSlowPointers;

public class HappyNumbers
{
public static String printStingWithMarkers(String strn, int pValue)
{
    String out = "";
    for (int i = 0; i < pValue; i++) {
        out += String.valueOf(strn.charAt(i));
    }
    out += "«";
    out += String.valueOf(strn.charAt(pValue)) + "»";
    for (int i = pValue + 1; i < strn.length(); i++) {
        out += String.valueOf(strn.charAt(i));
    }
    return out;
}
public static int sumOfSquaredDigits(int number)
{

}
}
