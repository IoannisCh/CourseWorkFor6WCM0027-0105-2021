
package visualcomponent;

/**
 *
 * @author yiannis
 */
public class Decorator {
    private final VisualComponent interfaceReference;
    public Decorator(VisualComponent interfaceReference){
        this.interfaceReference = interfaceReference;
    }
    public void draw(){
        interfaceReference.draw();
    }
}
