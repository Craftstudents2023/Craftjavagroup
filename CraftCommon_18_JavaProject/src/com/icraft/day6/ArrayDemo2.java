package com.icraft.day6;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		double markOfStudent[] = new double[10];
//		markOfStudent[0] = 78;
//		markOfStudent[1] = 86.5;
		
		
		
		double markOfStudent[] = {78,86.5,100,67,68.9,84,85,75,90}; //10, ind 0-9
		
//		System.out.println(markOfStudent.length);
		
		//using for loop
		//let us calculate the average mark of student
		for(int i=0; i< markOfStudent.length; i++) {
			System.out.print(markOfStudent[i]+ " ");
		}
		
		System.out.println("\n");
		
		for(double elt: markOfStudent) {
			System.out.print(elt + " ");
		}

	}

}
