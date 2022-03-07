import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    private Calculator cal;

    @Before
    public void setUp() throws Exception {
        this.cal = new Calculator();
    }

    @After
    public void tearDown() throws Exception {
        cal = null;
    }

    @Test
    public void Testadd() throws Exception {
        assertEquals(8,cal.add(5,3));
    }

    @Test
    public void testSubtract() throws Exception {
        assertEquals(10,cal.sub(18,8));
    }

    @Test
    public void testMultiplyByZero() throws Exception {
        assertEquals(0,cal.mul(2,0));
    }

    @Test
    public void testMultiply() throws Exception {
        assertEquals(15,cal.mul(3,5));
    }

    @Test
    public void testDivide() throws Exception {
        assertEquals(5,cal.divide(10,2));
    }
   
}
