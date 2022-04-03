
import java.util.ArrayList;
import java.util.List;

// an interface (abstract class) to support the Composite pattern
public interface Component {
void show ();
}
// the Leaf class
public class File implements Component {
private int size;
private String name;
public File (String name, int size) {
this.size = size;
this.name = name;
}
// the leaf object shows details of itself
@Override
public void show () {
System.out.println (name + ": " + size);
}
}
// the Composite class
public class Folder implements Component {
private List<Component> contents;
private String name;
public Folder (String name) {
this.name = name;
contents = new ArrayList<> (); // Folder can have any number of children
// of type Component. An internal
ArrayList
// is used to hold these.
}
public void add (Component c) {
contents.add (c);
}
// The composite object must show each of its contents in turn
public void show () {
System.out.println ("Folder: " + name);
for (Component c : contents) {
c.show ()d2.add (f1)
d1.add (f2)
d1.add (f3)
// use the Composite pattern to show the contents of the hierarchy
d1.show ();
// or an individual file
f1.show ();
}
};
}
}
}
public class Demo {
public static void main (String[] args) {
File f1 = new File ("file1", 1000);
File f2 = new File ("file2", 1000);
File f3 = new File ("file3", 1000);
Folder d1 = new Folder ("folder1");
Folder d2 = new Folder ("folder2");
// place files/folders into a hierarchy
d1.add (d2)
d2.add (f1)
d1.add (f2)
d1.add (f3)
// use the Composite pattern to show the contents of the hierarchy
d1.show ();
// or an individual file
f1.show ();
}
}