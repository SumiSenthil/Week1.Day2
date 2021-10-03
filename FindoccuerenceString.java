package week1.day2;


public class FindoccuerenceString {

	public static void main(String[] args) {
		
		//Initialize the word
		String str1="Hello World";
		int Count =1;
		char[] charArray=str1.toCharArray();
		
		//Identify Length and convert to character
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i]=='l') {
				Count++;
			}
			
			
		}
		System.out.println("Number of characters in "+str1 +" is "+ Count);
	}

}
