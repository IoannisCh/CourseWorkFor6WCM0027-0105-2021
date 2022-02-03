public class TestMyCar {
    public static void main(String[] args) {
        RealCar myCar = new RealCar("Petrol");
        ModelCar myToy = new ModelCar("Clockwork");
        System.out.println(myCar.write());
        
        System.out.println(myToy.write());
    }
    
}

public class RealCar{
    String engine;
    
    RealCar(String petrolOrDiesel){
        engine = petrolOrDiesel;
    }
    
    String write(){
        return "This car has this type of engine: " + engine;
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
