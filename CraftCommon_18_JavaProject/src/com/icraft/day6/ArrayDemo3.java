package com.icraft.day6;

public class ArrayDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double markOfStudent[] = {78,86.5,100,67,68.9,84,85,75,90,99};
		
		double sum = 0;
		double avg;
		double size = markOfStudent.length;
		
		//sum
		for(int i=0; i<size; i++) {
			sum = sum + markOfStudent[i];
		}
		
		System.out.println("Total Mark: " + sum);
		
		avg =  sum/size;
		
		System.out.println("average mark: " + avg);
		

	}

}
