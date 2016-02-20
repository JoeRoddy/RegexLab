import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Joe on 2/19/16.
 */
public class DataValidatorTest {
        String stringToTest;
    @Test
    public void testIsValidUsername() throws Exception {
        stringToTest = "App";
        assertTrue("isValidUsername() failed",!DataValidator.isValidUsername(stringToTest));
        stringToTest = "app3";
        assertTrue("isValidUsername() failed",!DataValidator.isValidUsername(stringToTest));
        stringToTest = "ap";
        assertTrue("isValidUsername() failed",!DataValidator.isValidUsername(stringToTest));
        for(int x=0;x<25;x++){
            stringToTest+="a";
        }
        assertTrue("isValidUsername() failed",!DataValidator.isValidUsername(stringToTest));
        stringToTest="joeroddy";
        assertTrue("isValidUsername() failed",DataValidator.isValidUsername(stringToTest));
        System.out.println("isValidUsername() passed all tests.");
    }

    @Test
    public void testIsValidEnhancedUsername() throws Exception {
        stringToTest = "App";
        assertTrue("isValidEnhancedUsername() failed",!DataValidator.isValidEnhancedUsername(stringToTest));
        stringToTest = "ap";
        assertTrue("isValidEnhancedUsername() failed",!DataValidator.isValidEnhancedUsername(stringToTest));
        for(int x=0;x<25;x++){
            stringToTest+="a";
        }
        assertTrue("isValidEnhancedUsername() failed",!DataValidator.isValidEnhancedUsername(stringToTest));
        stringToTest = "3appp";
        assertTrue("isValidEnhancedUsername() failed",!DataValidator.isValidEnhancedUsername(stringToTest));
        stringToTest = "a_3";
        assertTrue("isValidEnhancedUsername() failed",DataValidator.isValidEnhancedUsername(stringToTest));
        System.out.println("isValidEnhancedUsername() passed all tests.");
    }

    @Test
    public void testIsValidIP() throws Exception {
        stringToTest = "a12.0.0.0";
        assertTrue("isValidIP() failed",!DataValidator.isValidIP(stringToTest));
        stringToTest = "256.5.5.5";
        assertTrue("isValidIP() failed",!DataValidator.isValidIP(stringToTest));
        stringToTest = "1.1.1.1.1";
        assertTrue("isValidIP() failed",!DataValidator.isValidIP(stringToTest));
        stringToTest = "1.1.1";
        assertTrue("isValidIP() failed",!DataValidator.isValidIP(stringToTest));
        stringToTest = "0001.1.1.1";
        assertTrue("isValidIP() failed",!DataValidator.isValidIP(stringToTest));
        stringToTest = "01.255.0.099";
        assertTrue("isValidIP() failed",DataValidator.isValidIP(stringToTest));
        System.out.println("isValidEnhancedUsername() passed all tests.");
    }
}