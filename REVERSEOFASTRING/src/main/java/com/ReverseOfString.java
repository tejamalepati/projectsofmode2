package com;

public class ReverseOfString {
	

	 public static String reverse(String s){



	 String reverse = "";

	 if( s!= null && s.length()>= 2) {

	  for(int i = 0; i< s.length();i++) {

	  reverse = s.charAt(i) + reverse;

	  }

	 }

	 else {

	  System.out.println("Enter valid string greater than 2 characters");

	  System.exit(0);

	 }

	 return reverse;

	 }

	}





	





