

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ProjectTest for student test cases.
 * Add all new test cases to this task.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ProjectTest
{
    /**
     * Default constructor for test class ProjectTest
     */
    public ProjectTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    //TODO add new test cases from here include brief documentation
    
     @Test(timeout=1000)
    public void testSensibleToStringSize() {
        assertEquals(0,1); //TODO replace with test code
    }

   
    @Test(timeout=1000)
    public void testGetDistinctNgrams() {
         assertEquals(0,1); //TODO replace with test code
    }
    
@Test(timeout=1000)
    public void testLaplaceExample() {
        assertEquals(0,1); //TODO replace with test code
    }
    
    @Test(timeout=1000)
    public void testSimpleExample() {
        assertEquals(0,1); //TODO replace with test code
    }


    @Test
    public void testTask3example() 
    {
        MarkovModel model = new MarkovModel(2,"aabcabaacaac");
        ModelMatcher match = new ModelMatcher(model,"aabbcaac");
        assertEquals(0,1); //TODO replace with test code
    }
}
