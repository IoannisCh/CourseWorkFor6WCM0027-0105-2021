/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author yiannis
 */
public class Main {
    
    static double convertCelciusToFahrenheit (double celcius){
        return (celcius * 9 / 5) +32;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double smallest = 0;
        double largest = 100;
        
        for (double i = smallest; i <= largest; i++){
            System.out.println(i + " in fahrenheit = ");
            System.out.format(".2f", convertCelciusToFahrenheit(i));
            System.out.println();
        }
    }
    
}
