/**
 * Created by Joe on 2/19/16.
 */
import java.util.regex.*;
public class DataValidator {
    public static boolean isValidUsername(String nameToValidate){
        if(nameToValidate.matches("[a-z]{3,25}")){
            return true;
        }
        return false;
    }
    public static boolean isValidEnhancedUsername(String nameToValidate){
        if(nameToValidate.matches("^[a-z][a-z0-9_]{2,25}")){
            return true;
        }
        return false;
    }
    public static boolean isValidIP(String IPtoValidate){
        if(IPtoValidate.matches("(([0-9]|[0-9][0-9]|[0-1][0-9][0-9]|[2][0-5][0-5])\\.){3}([0-2][0-5][0-5]|[0-1][0-9][0-9]|[0-9][0-9]|[0-9])")){
            return true;
        }
        return false;
    }
}
