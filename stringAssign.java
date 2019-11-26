package com.demo;

public class StringAssignment {
	
	public static void checkPalindrome(String string) {

	String s = "GeeksforGeeks "; 
	
		 String reverse = new StringBuffer(s).reverse().toString();
		System.out.println(reverse);
		char[] gfg = s.toCharArray(); 
		for (int i = 0; i < gfg.length; i++)
			 
		{ System.out.print(gfg[i]); }		
		
			if (s.equals(reverse)) 
			      System.out.print("is palindrome"); 
			  
			    else
			      System.out.print("is not palindrome"); 
			  } 

	
	public static void main(String[] args) {
		checkPalindrome("GeeksforGeeks ");
	}

}




