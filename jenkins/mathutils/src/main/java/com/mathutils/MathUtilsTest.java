import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MathUtilsTest {

    private MathUtils mathUtils;

    @Before
    public void setUp() {
        mathUtils = new MathUtils();
    }

    @After
    public void tearDown() {
        mathUtils = null;
    }

    @Test
    public void testAdd() {
        assertEquals(5, mathUtils.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(3, mathUtils.subtract(5, 2));
    }

    @Test
    public void testMultiply() {
        assertEquals(10, mathUtils.multiply(2, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(2.5, mathUtils.divide(5, 2), 0.001);
    }

    @Test
    public void testDivideByZero() {
        assertEquals(-1.0, mathUtils.divide(5, 0), 0.001);
    }
}
