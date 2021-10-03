package week1.day2;

import java.util.Arrays;

public class ArrayMissingElement {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,7,6,8};
		int j;
					
		//Sort Arrays in ascending order
		Arrays.sort(arr);
		
	for (int i = 0; i < arr.length; i++) {			
			//Compare array with Iteration and display missing value
		if (arr[i]!=i+1) {
			j=i+1;
			System.out.println("Missing Value" + j);
			break;
		  }
		}

	  }

	}


