
package racingcar;

/**
 *
 * @author yiannis
 */
public class RacingCar {
    String name;
    RacingCar(String name){
        this.name = name;
    }
    
    RacingCar(){
        this("Brabham");
    }
  
    public static void main(String[] args) {
        RacingCar car1 = new RacingCar("Ferrari");
        RacingCar car2 = new RacingCar();
    }
    
}
