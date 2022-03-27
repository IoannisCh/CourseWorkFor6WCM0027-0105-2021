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
public class MainTest {
    
    /**
     *
     */
    public MainTest() {
    }
  

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //

    /**
     *
     */
     @Test 
     public void testConvertCelsiusToFahrenheit() {
         assertEquals(32.0, Main.convertCelsiusToFahrenheit(0.0), 0.001);
         assertEquals(212.0, Main.convertCelsiusToFahrenheit(100.0), 0.001);
         assertEquals(33.8, Main.convertCelsiusToFahrenheit(1.0), 0.001);
     }
}
