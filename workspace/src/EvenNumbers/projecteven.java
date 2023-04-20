package EvenNumbers;
	import java.util.Scanner;

	public class projecteven {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = scanner.nextInt();

	        System.out.println("Even numbers between 1 and " + num + ":");
	        for (int i = 1; i <= num; i++) {
	            if (i % 2 == 0) {
	                System.out.println(i);
	            }
	        }
	    }
	}