package za.ac.cput.donation.util;

public class Helper {
    public static boolean isValid(int d){
        return d > 0;
    }
    public static boolean isValid(long d){
        return d > 0;
    }
    public static boolean isValid(String d){
        return d != null && !d.trim().equals("");
    }
    public static boolean isValidPassword(String p){
        return isValid(p) && p.length() > 4;
    }
    public static boolean isValidEmail(String p){
        return isValid(p) && p.matches("^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$");
    }
}
