package weather;

import java.util.Scanner;

public class Summerblues {
	
  //System.out.println("Summer is here! :)");

	public static void main(String[] args) {
		
		        // TODO Auto-generated method stub
		        // Double temperature;
				do {
					
					Scanner temp = new Scanner(System.in);
					System.out.println("Enter temperature in Fahrenheit:");
					Double temperature = temp.nextDouble();
					Double celsius = (temperature-32)*5/9;
					System.out.println("temp is : "+celsius);
				    }
				        while(true) ;   
			    }
			
			

	}


