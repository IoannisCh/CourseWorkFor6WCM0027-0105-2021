
package audio;

import java.io.File;

/**
 *
 * @author yiannis
 */
public class Demo {

    public static void main(String[] args) {
        File f1 = new File ("file1", 1000);
        File f2 = new File ("file2", 1000);
        File f3 = new File ("file3", 1000);
        Folder d1 = new Folder("folder1");
        Folder d2 = new Folder("folder2");
        
        d1.add(d2);
        d2.add(f1);
        d1.add(f2);
        d1.add(f3);
        d1.show();
        f1.show();
    }
    
}
