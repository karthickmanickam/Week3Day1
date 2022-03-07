package org.assignment5;
public class FindTypes {
	public static void main(String[] args) {
		// Here is the input
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		// Here is what the count you need to find
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		//a) Convert the String to character array
		char[] char1 = test.toCharArray();

		//b) Traverse through each character (using loop)
		for (int i =0 ; i<char1.length;i++)
		{
			//c) Find if the given character is what type using (if)
			if(Character.isAlphabetic(char1[i]) )
			{
				letter++;
			}
			else if (Character.isDigit(char1[i]))
			{
				num++;
				
			}
			else if (Character.isSpaceChar(char1[i]))
			{
				space++;
			}
			else
			{
				specialChar++;
			}
		
		}
		// Print the count here
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);
	}
}
