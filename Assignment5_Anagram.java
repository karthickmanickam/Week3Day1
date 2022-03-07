package org.assignment5anagram;
import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		//Declare a String 
		String text1 = "stops";
		
		//Declare another String
		String text2 = "potss"; 
		boolean status = true;   
		//Length of text1 & text 2
		int len1 = text1.length();
		int len2 = text2.length();
				//a) Check length of the strings are same then (Use A Condition)
		if (len1 == len2) {
			// Convert both Strings in to characters
			char[] arrayS1 = text1.toLowerCase().toCharArray();
			char[] arrayS2 = text2.toLowerCase().toCharArray();
			
			//Sort Both the arrays
			Arrays.sort(arrayS1);
			Arrays.sort(arrayS2);
			
			//Check both the arrays has same value
			status = Arrays.equals(arrayS1, arrayS2);   
			
			if (status) {
				System.out.println(text1 + " and " + text2 + " are anagrams");
			}
				else {
					System.out.println(text1 + " and " + text2 + " are not anagrams");	
				}
			
			}
		else {
			System.out.println("The lenght is not same for text1 & text2");
		}
	}
	
}
