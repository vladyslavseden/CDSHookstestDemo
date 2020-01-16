package Help.utils.helpers;

public class Random {
    public static String getRandomString()
    {
        return  Long.toHexString(Double.doubleToLongBits(Math.random()));
    }
}
