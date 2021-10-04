package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";		 
			String text2 = "posts";
			boolean status;
			if (text1.length()!=text2.length()) 
			{
				System.out.println("Both Texts are of different length. So Texts cannot be Anagram");
			}
			else
			{
				char[] charArray=text1.toCharArray();
				char[] charArray1=text2.toCharArray();
				Arrays.sort(charArray);
				Arrays.sort(charArray1);	
				status = Arrays.equals(charArray, charArray1);
				if (status==true) 
				{
					System.out.println("Both Texts are same.So, texts are Anagram");}
				else
					{
						System.out.println("Both Texts are different.So, Texts cannot be Anagram");
					}
					
				}
				
	}
						
}				
			
				
