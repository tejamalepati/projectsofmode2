package com;

import java.util.Scanner;

public class stringReverse {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the string");

		String originalString = scan.next();

		String reverseString = ReverseOfString.reverse(originalString);

		if (reverseString.equals(originalString)) {

			System.out.println("Given string is a palindrome");

		}

		else {

			System.out.println("Given string is not a palindrome");

		}

		// System.out.println(reverseString);

		scan.close();

	}

}
