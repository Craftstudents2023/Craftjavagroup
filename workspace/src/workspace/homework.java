package workspace;

import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    		double cel;
    		boolean tryagain;
        	do {
    	System.out.println("Please enter ur tempreture in F");

    	double n = scanner.nextDouble();
    	cel =(n-32)*5/9;
    	System.out.println("the tempreture is " +cel+ " celcious");
    	System.out.println("  ");
        	}while (tryagain=true);
}
}