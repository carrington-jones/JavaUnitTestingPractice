import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FirstTest {

    @Test
    public void StringEqualsTest(){
        String expected  = "Codeup";
        String actual = "CodeUp";

        assertNotEquals(expected, actual);
    }

    @Test
    public void arrayListTest(){
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(languages, moreLanguages);
    }
}
