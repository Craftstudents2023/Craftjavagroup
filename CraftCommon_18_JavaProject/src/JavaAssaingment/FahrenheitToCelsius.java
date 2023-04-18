package JavaAssaingment;
import java.util.Scanner;
public class FahrenheitToCelsius {
   
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter temperature in Fahrenheit (or enter -999 to quit): ");
            double fahrenheit = input.nextDouble();
            
            if (fahrenheit == -999) {
                System.out.println("Quitting program...");
                break;
            }
            
            double celsius = (fahrenheit - 32) * 5/9;
            
            System.out.println(fahrenheit + " degrees Fahrenheit is " + celsius + " degrees Celsius.");
        }
    }
}
