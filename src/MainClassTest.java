import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    @Test
    public void testGetLocalNumber(){
        int localNumber = new MainClass().getLocalNumber();
        int expectedNumber = 14;
        Assert.assertTrue("Expected number = "+ expectedNumber+
                " isn't equal local number = "+ localNumber, expectedNumber == localNumber);
    }
}
