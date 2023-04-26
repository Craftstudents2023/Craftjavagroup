package com.icraft.challenge;

import java.util.Scanner;

public class ChallengePractices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create a two dimensional array that accepts and displays students mark.
		// create row and column

		Scanner mark = new Scanner(System.in);
		System.out.println("Enter  size of array");
		int size = mark.nextInt();

		int[] studMark = new int[size];

		// take input
		System.out.println("Enter marks in  arrays;");
		for (int i = 0; i < studMark.length; i++) {

			studMark[i] = mark.nextInt();
		}
		System.out.println("Display arrays;");
		// output values
		for (int n = 0; n < studMark.length; n++) {

			System.out.print(studMark[n] + " ");
		}
		System.out.println();

		// find maximum mark

		int max = studMark[0];
		for (int i = 0; i < studMark.length; i++) {

			if (max < studMark[i]) {
				max = studMark[i];
			}

		}
		System.out.println("Maximum Mark: " + max);
		System.out.println("Arrays in descending order;");
		// arranging marks in desc order
		int temp = 0;
		for (int i = 0; i < studMark.length; i++) {
			for (int j = i + 1; j < studMark.length; j++) {
				if (studMark[i] < studMark[j]) {
					temp = studMark[i];
					studMark[i] = studMark[j];
					studMark[j] = temp;
				}
			}
		}
		for (int m = 0; m < studMark.length; m++) {
			System.out.print(studMark[m] + ",");
		}

	}

}
