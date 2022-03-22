

public class RealCar(){
    private String engine;
    private String colour;
    private String make;
    
    RealCar(String petrolOrDiesel, String colour, String make){
        engine = petrolOrDiesel;
        this.colour = colour;
        this.make = make;
    }
    
    String write(){
        return "This car has this type of engine: " + 
                getEngine() +"is of colour" + getColour() + "and make" + getMake();
    }

    /**
     * @return the engine
     */
    public String getEngine() {
        return engine;
    }

    /**
     * @param engine the engine to set
     */
    public void setEngine(String engine) {
        this.engine = engine;
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
     * @return the make
     */
    public String getMake() {
        return make;
    }

    /**
     * @param make the make to set
     */
    public void setMake(String make) {
        this.make = make;
    }
}


