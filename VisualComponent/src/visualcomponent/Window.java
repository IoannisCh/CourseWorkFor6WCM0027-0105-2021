
package visualcomponent;

/**
 *
 * @author yiannis
 */
public class Window {
    public static void main(String[] args){
        TextView textView = new TextView();
        
        textView = (new BorederDecorator(new ScrollDecorator(textView)));
    }
}
