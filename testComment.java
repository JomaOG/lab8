

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class testComment.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class testComment
{
    /**
     * Default constructor for test class testComment
     */
    public testComment()
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
    public void addComment()
    {
        SalesItem salesIte1 = new SalesItem("Clothes", 6000);
        assertEquals(true, salesIte1.addComment("person1", "Great", 4));
        assertEquals(false, salesIte1.addComment("person1", "Okay", 3));
        assertEquals(1, salesIte1.getNumberOfComments());
    }

    @Test
    public void testRatingBoundaries()
    {
        SalesItem salesIte1 = new SalesItem("Clothes", 6000);
        assertEquals(false, salesIte1.addComment("person1", "Great", 6));
        assertEquals(false, salesIte1.addComment("person2", "Eww", 0));
        assertEquals(0, salesIte1.getNumberOfComments());
    }
}


