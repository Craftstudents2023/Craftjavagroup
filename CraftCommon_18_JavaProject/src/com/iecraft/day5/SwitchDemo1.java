package com.iecraft.day5;

import java.util.*;
public class SwitchDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in   = new Scanner(System.in);
		System.out.println("Enter any number 1  to 7");
		int day = in.nextInt();
		
		switch(day){
		case 1:
			System.out.println("Its monday");
			break;
		
		case 2:
			System.out.println("Its Tuesday");
			break;
		
		case 3:
			System.out.println("Its Wednesday");
			break;
			
		case 4:
			System.out.println("It's Thursday");
			break;
		
		case 5:
			System.out.println("It's Friday");
			break;
			
		case 6:
			System.out.println("It's Saturday");
			break;
		case 7:
			System.out.println("It's Sunday");
			break;
			
	   default:
		   System.out.println("It's Invalid date");
			
		}
	}

}
