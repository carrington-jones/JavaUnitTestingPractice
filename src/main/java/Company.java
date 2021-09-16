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

    @Test
    public void testIfChangeIsCorrect(){
        Double price = 10.00;
        Double discount = 4.50;

        assertEquals(5.5,price - discount, 0);
        assertEquals(5.1, price - discount,0.5); // This test passes because of margin of error in Delta.
        assertNotEquals(4.9, price - discount, 0.5); //Test passes because 4.9 is not an expected answer, and we used assertNotEquals

        //When using floating points values a third parameter (Delta) is required. Delta represents positive margin of error of decimals.
    }

}
