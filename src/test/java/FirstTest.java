import org.junit.Test;

import static org.junit.Assert.*;

public class FirstTest {

    @Test
    public void StringEqualsTest(){
        String expected  = "Codeup";
        String actual = "CodeUp";

        assertNotEquals(expected, actual);
    }
}
