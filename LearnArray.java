package week1.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		
		int arr[] = {100,49,398,34,1,267};
		//Find Length of array
		int Length = arr.length;
		System.out.println("Length of Array " + Length);
		
		//Print all arrays
		System.out.println("Display Array : ");
		for (int i = 0; i < arr.length; i++) {
			
		
			System.out.println(+ arr[i]);
		}
		
		//Sort Arrays in ascending order
		Arrays.sort(arr);
		
		System.out.println("Sorted Array : ");
		for (int i = 0; i < arr.length; i++) {			
			
			System.out.println( + arr[i]);
		}
		
		//Print second largest number
		System.out.println("First Largest Number : " + arr[Length-1]);
		
		//Print second smallest number
		System.out.println("Second smallest Number : " + arr[1]);
	}

}
