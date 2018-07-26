package example.asserttest;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertTest {

    @Test
    public void testAssertEquals () {
        String results = "wartość";
        assertEquals("wartość inna !", "wartość", results);
    }
    @Test
    public void testAssertSame () {
        Long v1 = Long.valueOf(123456);
        Long v2 = v1;
        assertSame("Inny obiekt", v1, v2);
    }
    @Test
    public void testAssertTrue () {
        assertTrue("Nieprawda", 2>3);
    }
    @Test
    public void testAssertNotNull () {
        Long v1 = Long.valueOf(12345);

        assertNotNull("Nieprawda", v1);
    }
    @Test
    public void testAssertArrayEquals () {
        int [] t1 = {1,2,3,4,5};
        int [] t2 = {1,2,3,4,5};
        assertArrayEquals(t1, t2);
    }
}
