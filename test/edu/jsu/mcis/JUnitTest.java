
package edu.jsu.mcis;

import mcis.jsu.edu.TestClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aseel
 */
public class JUnitTest {
    
    public JUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    @Test
    public void testclassMethod1(){
        assertEquals(TestClass.testMethod1(),"Hello,World!");
    }
    @Test
    public void testclassMethod2(){
        assertEquals(TestClass.testMethod2(),"Hello there,world");
          }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
