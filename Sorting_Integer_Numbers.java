package SortingIntegers;

import java.util.Arrays;

import java.util.Scanner;

public class Sorting_Integer_Numbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = input.nextInt();
		int[] elements = new int[size];
		System.out.print("Enter the elements: ");
		for (int i = 0; i < size; i++) {
			elements[i] = input.nextInt();
		}
		Arrays.sort(elements);
		int[] descending = new int[elements.length];
		for (int i = 0; i < elements.length; i++) {
			descending[i] = elements[elements.length - i - 1];
		}
		System.out.println("Sorted in descending order: " + Arrays.toString(descending));

	}

}
