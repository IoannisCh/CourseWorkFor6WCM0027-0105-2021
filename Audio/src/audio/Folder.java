
package audio;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yiannis
 */
public class Folder implements Component {
    private List<Component> contents;
    private String name;
    
    public Folder (String name){
        this.name = name;
        contents = new ArrayList<Component>();
    }
    
    public void add (Component c){
        contents.add(c);
    }
    
    public void show(){
        System.out.println("Folder: " + name);
        for (Component c : contents){
            c.show();
        }
    }

    void add(File f1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
