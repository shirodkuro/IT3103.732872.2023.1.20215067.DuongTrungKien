// Exercises: 6.5 ArraySort.java

import java.util.Scanner;

public class ArraySort {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		
		System.out.println("Size of your array: ");
		int size = scanner.nextInt();
		
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter element " +i+" of your array: ");
			array[i] = scanner.nextInt();
			sum += array[i];
		}
		
		System.out.print("Array: ");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		bubbleSort(array);
		
		System.out.print("After being sorted: ");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
		
		double average = (double)sum / size;
		
		System.out.println();
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + average);
		
		scanner.close();
	}	
	
	public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = (n-1); i >= 0; i--) {
            for (int j = 1; j <= i; j++){
                if (array[j-1] > array[j]) {
                	int temp = array[j-1];
                	array[j-1] = array[j];
                	array[j] = temp;
                }
            }
        }
    }
}