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

        // When using floating points values a third parameter (Delta) is required. Delta represents positive margin of error of decimals.
    }

    @Test
    public void testIfObjectsAreDifferent(){
        Object dog = new Object();
        Object sheep = new Object();
        Object clonnedSheep = sheep;

        assertNotSame(sheep, dog); // Passes the test because the objects are NOT the same.
        assertSame(sheep, clonnedSheep); //Test passes because the objects are the same.
    }

    @Test
    public void TestIfArrayEquals(){
        char[] expected = {'J', 'u', 'n', 'i', 't'};
        char[] actual = "Junit".toCharArray();

        assertArrayEquals(expected, actual); // Test passes because char[] actual converts "Junit" String to array which equals char[] expected
    }


}
