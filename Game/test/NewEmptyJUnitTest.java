
import game.Scene;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author yiannis
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
   
    @Test
    public void testGetHeight() {
        Scene scene = new Scene(0, 0);
        assertEquals(0, scene.getHeight());
    }
}
