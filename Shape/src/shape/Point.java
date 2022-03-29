
package shape;

/**
 *
 * @author yiannis
 */
public class Point {
    private int x, y;
    
    public Point(int a, int b){
        setPoint(a, b);
    }
    
    public void setPoint(int a, int b){
        x = a;
        y = b;
    }
    
    public int getX(){ return x;}
    public int getY(){ return y;}  
}
