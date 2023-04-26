package com.icraft.day6;

import java.util.Scanner;

public class ArrayDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDemo3 m2 = new ArrayDemo3();
		double markOfStudent[] = {78,86.5,100,67,68.9,84,85,75,90,99};
		calcMark(markOfStudent);
	}

	 protected static void calcMark(double[] mark) {
		// TODO Auto-generated method stub
		
		double sum = 0; 
		double avg;
		int size = mark.length;
		
		for(double elt: mark) {
			sum = sum + elt;
		}
		
		avg = sum / size;
		
		System.out.println("Total Mark: " + sum);
		System.out.println("average mark: " + avg);
		
	}

}
