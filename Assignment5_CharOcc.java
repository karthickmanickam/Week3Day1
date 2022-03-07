package org.assignment5;

public class CharOccuranceCharOccurance {

	public static void main(String[] args) {
		// Check number of occurrences of a char (eg 'e') in a String
		
		String str = "welcome to chennai";
		//int count = str.length() - str.replace("e", "").length();
		//System.out.println("occurrence of e: " +count);
		
		// declare and initialize a variable count to store the number of occurrences
		 int count1 = 0;
		 
		 // convert the string into char array
		 char[] char1 = str.toCharArray();
		
		 
		//get the length of the array
		 int len = char1.length;
		 
		// traverse from 0 till the array length 
		 for (int i =0; i<len; i++) 
		 {
			 
			// Check the char array has the particular char in it 
			 if(char1[i] == 'e') 
			 {
				 // if is has increment the count
				 count1++;
			 }
		 }
		 // print the count out of the loop
		 System.out.println("occurrence of e: "+count1);
	}
}
