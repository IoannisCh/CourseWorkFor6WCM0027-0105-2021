
package TestMyCar;

/**
 *
 * @author yiannis
 */
public class FamilyCar extends RealCar{
    private final String entertainementSystem;
    
    public FamilyCar(String entertainementSystem,
                     String engine,
                     String registrationNumber,
                     String make){
        super(engine, registrationNumber, make);
        this.entertainementSystem = entertainementSystem;
    }
    public String getEntertainmentSystem(){
        return entertainementSystem;
    }

    public boolean getNumberOfCars() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
