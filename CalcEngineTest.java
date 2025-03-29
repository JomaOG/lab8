

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CalcEngineTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CalcEngineTest
{
    /**
     * Default constructor for test class CalcEngineTest
     */
    public CalcEngineTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void testAll()
    {
        CalcEngine calcEngi1 = new CalcEngine();
        calcEngi1.clear();
        calcEngi1.numberPressed(3);
        calcEngi1.plus();
        calcEngi1.numberPressed(4);
        calcEngi1.equals();
        assertEquals(7, calcEngi1.getDisplayValue());
        calcEngi1.clear();
        calcEngi1.numberPressed(9);
        calcEngi1.minus();
        calcEngi1.numberPressed(4);
        calcEngi1.equals();
        assertEquals(5, calcEngi1.getDisplayValue());
        calcEngi1.clear();
        calcEngi1.numberPressed(3);
        calcEngi1.plus();
        calcEngi1.numberPressed(4);
        calcEngi1.equals();
        assertEquals(7, calcEngi1.getDisplayValue());
    }

    @Test
    public void testQ30()
    {
        CalcEngine calcEngi1 = new CalcEngine();
        calcEngi1.clear();
        calcEngi1.numberPressed(9);
        calcEngi1.plus();
        calcEngi1.numberPressed(1);
        calcEngi1.minus();
        calcEngi1.numberPressed(4);
        calcEngi1.equals();
        assertEquals(6, calcEngi1.getDisplayValue());
    }
}


