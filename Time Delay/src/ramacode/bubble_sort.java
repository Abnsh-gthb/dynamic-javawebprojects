package ramacode;

import java.util.*;

public class bubble_sort {
	static void bubbleSort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					// swap elements
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
		}

	}

	public static void main(String[] args) {
		System.out.println("Enter your array length ->");
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int arr[] = new int[len];

		System.out.println("Enter your list elements  !!!");
		System.out.println("Plz do not Enter value more than 6 as Your first value !! -> XD ");
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				int temp = sc.nextInt();
				if (temp <= 6) {
					arr[i] = temp;
				} else {
//	                i=0 does not work here!!
					i--;
					System.out.println("Plz recheck Your value!!");
//	                continue;                  	
				}

			}

			else {
				arr[i] = sc.nextInt();
			}
		}

		try {
			for (int i = 0; i < arr[i]; i++) {

				System.out.println("Your array is getting prepared..............");
//	                			 here cannt devide by arr_length!!
				Thread.sleep(7000 / arr[0]);
			}

		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		bubbleSort(arr);// sorting array elements using bubble sort

		System.out.println("Array After Bubble Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		sc.close();
	}

}