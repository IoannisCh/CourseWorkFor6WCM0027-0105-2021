

package visualcomponent;

/**
 *
 * @author yiannis
 */
public class ScrollDecorator extends Decorator {
    public ScrollDecorator (VisualComponet interfaceReference){
        super(interfaceReference);
    }

    private ScrollDecorator(VisualComponet interfaceReference) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public void draw(){
        super.draw();
        scrollTo();
    }
    
    public void scrollTo(){
       
    }
}
