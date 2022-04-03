
public class SimpleLogger {
    
    private final int ERROR = 1;
    private final int WARNING = 2;
    private final int level;
   
    public SimpleLogger (int level){
        this.level = level;
    }
    
    public void error (String msg){
        if (level>=ERROR){
            System.out.println("Error: " + msg);
        }
        
    public void warning (String msg){
        if (ERROR < level){
            System.out.println("Warining: " + msg);
        }
    }
    }
