/**
 *
 * @author yiannis
 */
public class TestMyCar {
    public static void main(String[] args) {
        RealCar myCar = new RealCar("Petrol", "Blue", "Ford");
        ModelCar myToy = new ModelCar("Clockwork");
        System.out.println(myCar.write());
        
        System.out.println(myToy.write());
    }
}

public class RealCar() {
    String engine;
    String colour;
    String make;
    
    RealCar(String petrolOrDiesel, String colour, String make){
        engine = petrolOrDiesel;
        this.colour = colour;
        this.make = make;
    }
    
    String write(){
        return "This car has this type of engine: " + 
                engine +"is of colour" + colour + "and make" + make;
    }
}

public class ModelCar{
    String engine;
    
    ModelCar(String engine){
        this.engine = engine;
    }
    
    String write(){
        return "My model car is powered by " + engine;
    }
}
