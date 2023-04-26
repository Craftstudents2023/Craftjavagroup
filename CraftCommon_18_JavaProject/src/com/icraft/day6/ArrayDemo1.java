package com.icraft.day6;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ageOfStudent  = new int[5];//0-4
		
		ageOfStudent[0] = 18;
		ageOfStudent[1] = 19;
		ageOfStudent[2] = 20;
		ageOfStudent[3] = 21;
		ageOfStudent[4] = 34;
//		ageOfStudent[5] = 34;
		
//		System.out.println(ageOfStudent[0]);
//		System.out.println(ageOfStudent[1]);
//		System.out.println(ageOfStudent[2]);
//		System.out.println(ageOfStudent[3]);
//		System.out.println(ageOfStudent[49]);
		
	// for loop, for-each loop, while loop, do while loop...
		
		//use for-each
		
		for(int elt: ageOfStudent) {
			System.out.print(elt + " ");
		}
		
	}

}
