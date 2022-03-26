package converter;

import com.sun.tools.javac.Main;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author yiannis
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test 
     public void testConvertCelsiusToFahrenheit() {
         System.out.println("convertCelciusToFahrenheit");
         double celsius = 0.0;
         double expResult = 0.0;
         double result;
         result = Main.convertCelsiusToFahrenheit(celsius);
         assertEquals(32.0, Main.convertCelsiusToFahrenheit(0.0), 0.001);
         
         fail("The test case is a prototype.");  
     }
     
     @Test
     public void testMain() throws Exception{
         System.out.println("main");
         String[] args = null;
         Main.main(args);
         
         fail("The test case is a prototype");
     }
}
