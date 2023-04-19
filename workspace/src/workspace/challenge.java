package workspace;

import java.util.Scanner;
import java.util.Arrays;
public class challenge {

	public static void main(String[] args) {
	 int[] numbers= new int[5];
		System.out.println("please enter a new number");
		Scanner scanner = new Scanner(System.in);
		numbers[0]=scanner.nextInt();
		System.out.println("please enter another number");

		numbers[1]=scanner.nextInt();
		System.out.println("please enter another number");

		numbers[2]=scanner.nextInt();
		System.out.println("please enter another number");

		numbers[3]=scanner.nextInt();
		System.out.println("please enter another number");

		numbers[4]=scanner.nextInt();
		
        System.out.println("The numbers entered are: ");  
 
           Arrays.sort(numbers);
           
           System.out.println(Arrays.toString(numbers));
		
           
}
	}