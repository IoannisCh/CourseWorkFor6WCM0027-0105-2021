
package shape;

/**
 *
 * @author yiannis
 */
public final class Circle extends Point{
    private int radius;
    
    public Circle(){
        this(0, 0, 0);
    }
    
    public Circle(int s, int a, int b){
        super(a, b);
        setRadius(s);
    }
    
    public void setRadius(int s){
        radius = s;
    }
    
    public int getRadius(){
        return radius;
    }
    
    public getArea(){
    }

    /**
     *
     */
    public class CircPoint {
    public static void main(String[] args){
        
        Shape.Circle p = new Shape.Circle();
        p.setPoint(10, 10);
    }
}
}
