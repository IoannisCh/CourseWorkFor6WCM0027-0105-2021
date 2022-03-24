package TestMyCar;

public class RealCar{
        private final String make;
        private final String registrationNumber;
        private String colour;
        private static int numberOfRegisteredCars;
        private static int numberOfFords;
        private static int numberOfBMWs;
        
        public RealCar(String registrationNumber, String make){
            this.registrationNumber = registrationNumber;
            this.make = make;
            
            
            if (make.equals ("Ford")){
                numberOfFords += 1;
            } else if (make.equals ("BMW")){
                numberOfBMWs += 1;
            }
            
        }

    public RealCar(String diesel, String def_123G, String bmw) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        
        public String getMake(){
            return make;
        }
        
        public String getReg(){
            return registrationNumber;
        }

    /**
     * @return the colour
     */
    public String getColour() {
        return colour;
    }

    /**
     * @param colour the colour to set
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

    /**
     * @return the numberOfRegisteredCars
     */
    public static int getNumberOfRegisteredCars() {
        return numberOfRegisteredCars;
    }

    /**
     * @param aNumberOfRegisteredCars the numberOfRegisteredCars to set
     */
    public static void setNumberOfRegisteredCars(int aNumberOfRegisteredCars) {
        numberOfRegisteredCars = aNumberOfRegisteredCars;
    }

    /**
     * @return the numberOfFords
     */
    public static int getNumberOfFords() {
        return numberOfFords;
    }

    /**
     * @param aNumberOfFords the numberOfFords to set
     */
    public static void setNumberOfFords(int aNumberOfFords) {
        numberOfFords = aNumberOfFords;
    }

    /**
     * @return the numberOfBMWs
     */
    public static int getNumberOfBMWs() {
        return numberOfBMWs;
    }

    /**
     * @param aNumberOfBMWs the numberOfBMWs to set
     */
    public static void setNumberOfBMWs(int aNumberOfBMWs) {
        numberOfBMWs = aNumberOfBMWs;
    }

    public boolean getNumberOfCars() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

