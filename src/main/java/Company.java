import org.junit.Test;
import static org.junit.Assert.*;

public class Company {

//Test if company name equals
    @Test // This test will pass
    public void testIfCompanyNameIsEquals(){
        String expected = "Amazon";
        String actual = "Amazon";

        assertEquals(expected, actual);
    }

    @Test //This test will fail because expected and actual are different
    public void testIfCompanyNameIsEquals2(){
        String expected = "Amazon";
        String actual = "Amazon2";

        assertEquals(expected, actual);
    }
}
