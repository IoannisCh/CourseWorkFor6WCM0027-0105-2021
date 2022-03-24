
import TestMyCar.FamilyCar;
import TestMyCar.RealCar;



public class TestMyCar {
    public static void main(String[] args) {
       FamilyCar myCar = new FamilyCar("CD Player", "Petrol", "ABC 123D", "Toyota");
      
       System.out.println(myCar.getMake());
       System.out.println(myCar.getReg());
       System.out.println(myCar.getEntertainmentSystem());
       System.out.println(myCar.getNumberOfCars());
       
       RealCar myCar2 = new RealCar("Diesel", "DEF 123G", "BMW");
       
       System.out.println(myCar2.getMake());
       System.out.println(myCar2.getReg());
       System.out.println(myCar2.getNumberOfCars());
    }
    
}
