public class Main{
    
       public static void main(String[] args) {
        RealCar myCar = new RealCar("Petrol", "Blue", "Ford");
        ModelCar myToy = new ModelCar("Clockwork");
        System.out.println(myCar.write());
        
        System.out.println(myToy.write());
    }
}
