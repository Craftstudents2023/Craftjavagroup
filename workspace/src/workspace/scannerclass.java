package workspace;
import java.util.Scanner;

public class scannerclass {

	public static void main(String[] args) {
		
		
	Scanner scanner = new Scanner(System.in);
	String firstname;
	String lastname;
	String gender;
	double salary; 
	double  bonus;
	
	System.out.println("Please enter firstname");
	firstname = scanner.nextLine();	

	System.out.println("Please enter lastname");
	lastname = scanner.nextLine();
	
	System.out.println("Please enter gender");
	gender = scanner.nextLine();
	
	System.out.println("Please enter your salary");
	salary = scanner.nextDouble();
	
	System.out.println("Please enter your bonus");
	bonus = scanner.nextDouble();
	
	System.out.println("Your Firstname is:" + firstname);
	System.out.println("Your Lastname is:" + lastname);
	System.out.println("Your Gender is:" + gender);
	System.out.println("Your Salary is:" + salary);
	System.out.println("Your Bonus is:" + bonus);
	
	double income = salary + bonus;
	
	
	System.out.println("Your Total nsalary is:" + income);
	
	}

}
