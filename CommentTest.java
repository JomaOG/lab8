

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CommentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CommentTest
{
    /**
     * Default constructor for test class CommentTest
     */
    public CommentTest()
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
    public void testStoredInfo()
    {
        Comment comment1 = new Comment("person1", "Great", 4);
        assertEquals("person1", comment1.getAuthor());
        assertEquals(4, comment1.getRating());
    }

    @Test
    public void testUpAndDownVotes()
    {
        Comment comment1 = new Comment("person1", "Great", 4);
        comment1.upvote();
        comment1.upvote();
        comment1.upvote();
        comment1.upvote();
        comment1.upvote();
        assertEquals(5, comment1.getVoteCount());
        comment1.downvote();
        comment1.downvote();
        comment1.downvote();
        comment1.downvote();
        comment1.downvote();
        comment1.downvote();
        assertEquals(-1, comment1.getVoteCount());
    }
}


