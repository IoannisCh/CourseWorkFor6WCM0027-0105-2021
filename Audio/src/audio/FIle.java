
package audio;

/**
 *
 * @author yiannis
 */
public class FIle implements Component{
    private int size;
    private String name;
    
    public FIle (String name, int size){
        this.size = size;
        this.name = name;
    }
    
    public void show(){
        System.out.println(name + ": " + size);
    }
 
}
