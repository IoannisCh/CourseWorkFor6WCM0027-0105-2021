
package shape;

/**
 *
 * @author yiannis
 */
public class Shape {

   private String shape;
           
   public void draw(){
       
   }
   
   public int getArea(){
       
       return (0);
       
   }
   
   public class Circle extends Shape{
       private int radius;
       public void setRadius(int r){
           radius = r;
       }
       
       public int getRadius(){
           return radius;
       }
       
    public class Rectangle extends Shape{
        private int height;
        private int width;
    }
    
    public class Triangle extends Shape{
        private int base;
        private int height;
        
        public int getArea(){
            
            return 0;
            
        }
    }

    /**
     * @return the shape
     */
    public String getShape() {
        return shape;
    }

    /**
     * @param shape the shape to set
     */
    
   }
}
  
   
