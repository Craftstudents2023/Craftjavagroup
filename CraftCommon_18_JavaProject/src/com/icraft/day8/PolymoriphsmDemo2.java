package com.icraft.day8;

public class PolymoriphsmDemo2 {
	
	static int add(int a) {
		return a+a;
	}
	
	static int add(int a, int b) {
		return a+b;
	}
	
	static double add(int a, double b) {
		return a+b;
	}
	
	static double add(double a, int b) {
		return a+b;
	}
	
	static double add(double a, double b ) {
		return a+b;
	}

	static int add(int a, int b,  int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		System.out.println(add(10,10,10));

	}

}
