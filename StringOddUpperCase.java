package week1.day2;

public class StringOddUpperCase {

	public static void main(String[] args) {
		String str="changeme";
		char str1;
		char[] charArray=str.toCharArray();
		int Len=charArray.length;
		//Identify Length and convert to character
		for (int i = 0; i<Len; i++) {
		
			if(i%2==0)
			{
				str1= Character.toUpperCase(charArray[i]);				
				System.out.println(str1);	
			}
			else
			{
				System.out.println(charArray[i]);
			}
			}
		}
		
	}	
	



