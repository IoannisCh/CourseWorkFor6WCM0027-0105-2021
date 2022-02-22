package converter;

import net.sourceforge.htmlunit.corejs.javascript.tools.shell.Main;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yiannis
 */
public class MainTest {
    
    public MainTest() {
    }
    @BeforeClass
    public static void setUpClass() throws Exception{
    }
    @AfterClass
    public static void tearDownClass() throws Exception{
    }
    @Before
    public void setUp(){
    }
    @After
    public void tearDown(){
    }
    @Test
    public void testConvertCelciusToFahrenheit(){
        System.out.println("converCelciusToFahrenheit");
        double celsius = 0.0;
        double expResult = 0.0;
        double result = Main.convertCelciusToFahrenheit(celsius);
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }
    @Test
    public void testMain(){
        System.out.println("main");
        String[] args = null;
        Main.main(args);
        fail("The test case is a prototype");
    }
    
    
    
}
