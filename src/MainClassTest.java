import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;


public class MainClassTest {

    @Test
    public void testGetLocalNumber(){
        int localNumber = new MainClass().getLocalNumber();
        int expectedNumber = 14;
        Assert.assertTrue("Expected number = "+ expectedNumber+
                " isn't equal local number = "+ localNumber, expectedNumber == localNumber);
    }

    @Test
    public void testGetClassNumber(){
        int expectedNumber = 45;
        int class_number = new MainClass().getClassNumber();

        Assert.assertTrue( "Expected number = "+ expectedNumber+
                " >= class_number = "+class_number, class_number > expectedNumber);
    }

    @Test
    public void testGetClassString(){
        String expectedStr_1 = "Hello";
        String expectedStr_2 = "hello";
        String class_string = new MainClass().getClassString();

        if(class_string.contains(expectedStr_1) || class_string.contains(expectedStr_2))
        Assert.assertTrue(true);
        else
        Assert.assertTrue("No matches found", false);
       // Assert.assertThat("No matches found", class_string, containsString(expectedStr_1));
       // Assert.assertThat("No matches found", class_string, containsString(expectedStr_2));

    }
}
