package week1.day2;

public class ArrayTwoSum {

	public static void main(String[] args) {
		int arr[]= {2,9,8,13,7,3};
		int target =11;
		//check when 2 numbers are added it should give 11
		for (int  i= 0; i < arr.length;i ++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]+arr[j]==target) {
					System.out.println(arr[i]);
					System.out.println(arr[j]);
				}
				
				
			}
		}
	}

}
