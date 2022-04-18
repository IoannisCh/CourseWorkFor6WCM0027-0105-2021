package converter;

/**
 *
 * @author yiannis
 */
public class Converter {
      static double convertCelsiousToFahrenheit(double celsius){
           return (celsius * 9 / 5) + 32;
       }
   
    public static void main(String[] args) {
        double smallest = 0;
        double largest = 100;
        
        for (double i = smallest; i <= largest; ++i){
            System.out.print(i+ " in fahrenheit = ");
            System.out.format("%.2f" , convertCelsiousToFahrenheit (i));
            System.out.println();
        }
  
    }
    
}
