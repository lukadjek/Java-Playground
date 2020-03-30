
package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Main {

	public static void main(String[] args) {

		System.out.println("*** FIBONACCI *** \n");
		
		fibonacci(10);
		
		System.out.println(); System.out.println();
		
		System.out.println("*** PRIME NUMBER *** \n");
		
		primeNumber(11);
		
		System.out.println(); System.out.println();
		
		System.out.println("*** STRING PALINDROME *** \n");

		palindrome("BoB");
		
		System.out.println(); System.out.println();
		
		System.out.println("*** INTEGER PALINDROME *** \n");

		palindromeInteger(1001);
		
		System.out.println(); System.out.println();
		
		System.out.println("*** FACTORIEL FIRST *** \n");
		
		factorielFirst(4);
		
		System.out.println(); System.out.println();
		
		System.out.println("*** FACTORIEL SECOND *** \n");

		factorielSecond(4);
		
		System.out.println(); System.out.println();
		
		System.out.println("*** REVERSE STRING *** \n");

		reverseString("Luka");
		
		System.out.println(); System.out.println();
		
		System.out.println("*** REMOVE DUPLICATES FROM THE LIST *** \n");
				
		ArrayList<Integer> list = new ArrayList<Integer>(); list.add(2); list.add(2); list.add(3);
		
		removeDuplicatesFromList(list);
		
		System.out.println(); System.out.println();
		
		LinkedList<String> list2 = new LinkedList<String>(); list2.add("a"); list2.add("a"); list2.add("b2");
		
		removeDuplicatesFromList(list2);
		
		System.out.println(); System.out.println();
		
		System.out.println("*** PYRAMID PATTERN 1 *** \n");
		
		pyramidPattern();
		
		System.out.println(); System.out.println();
		
		System.out.println("*** PYRAMID PATTERN 2 *** \n");
		
		pyramidPattern2();
		
		System.out.println(); System.out.println();
		
		System.out.println("*** FIND DUPLICATE CHARACTERS IN STRING *** \n");
		
		findDuplicateCharactersInString("JavaGG");
		
		System.out.println(); System.out.println();
		
		System.out.println("*** REVERSE ARRAY VARIANT 1 *** \n");
		
		reverseArray(new int[] {1,2,3,4,5,6,7});
		
		System.out.println(); System.out.println();
	
		System.out.println("*** REVERSE ARRAY VARIANT 2 *** \n");
		
		reverseArray2(new int[] {1,2,3,4,5,6,7});
		
		System.out.println(); System.out.println();
		
		System.out.println("*** REVERSE WORDS IN STRING *** \n");
		
		reverseWordsInSentence("java is great!");
		
		System.out.println(); System.out.println();
		
		System.out.println("*** LEAP YEAR *** \n");

		isLeapYear(2012);		// happens on 2012, 2016, 2020 so every 4 years!

		System.out.println(); System.out.println();
		
		System.out.println("*** BINARY SEARCH *** \n");
		
		binarySearch(new int[] {1,2,3,4,5}, 1);
		
		System.out.println(); System.out.println();
		
		System.out.println("*** ANAGRAM 1 *** \n");
		
		System.out.println( anagramOrNot("javA", "avaj") );
		
		System.out.println(); System.out.println();

		System.out.println("*** ANAGRAM 2 *** \n");

		System.out.println( anagramOrNot2("wrdo", "word") );
		
		System.out.println(); System.out.println();
		
		System.out.println("*** SWAP NUMBER WITHOUT TEMP. VARIABLE *** \n");

		swapNumberWithoutTemporaryVariable(5,8);
		
		System.out.println(); System.out.println();
		
			
				
	}

	
	 // Write a simple Java program which will print Fibonacci up to a given number count	
	
	public static void fibonacci(int upToThisNumberCount) {
		
		int n1 = 1;
		int n2 = 1;
		int n3 = 0;

		System.out.println( "Printing " + upToThisNumberCount + " fibonacci numbers:" );
		for (int i = 0; i <= upToThisNumberCount; i++) {
			
			if ( i == 1 || i == 2 ) {
				System.out.print(1 + " ");
			}
			else if ( i > 2 ) {
				
				  n3=n1+n2;    
				  System.out.print(n3 + " ");    
				  n1=n2;   	// n1 = 1;   n1 = 2;	...
				  n2=n3;    // n2 = 2;   n2 = 3;	...

				
			}
			
		}

	}
	
	 // Write a Java program to check if a given number is prime or not. 
	 // Remember, a prime number is a number which is not divisible by any other number, e.g. 3, 5, 7, 11, 13, 17, etc.
	

	public static void primeNumber(int number) {
		
		System.out.println("Checking this number: " + number);
		
		if ( number%2 == 0 ) {
			System.out.println("You gave as a prime number!");
		}
		else
			System.out.println("You gave as a non-prime number!");
		
	}
	
	 // You need to write a simple Java program to check if a given String is palindrome or not.
	
	public static void palindrome(String string) {
		
		System.out.println("Checking this string: " + string);
		
		boolean signal = false;

		
		if ( string == null ) {
			signal = false;
			System.out.println( "String cannot be null!" );
			return;
		}
		if ( string.strip().length() == 0 ) {
			System.out.println( "String cannot be empty!" );
			signal = false;
			return;
		}
		else {
			
			
			for (int i = 0; i < string.length(); i++) {
				
				
				if ( string.charAt(i) == string.charAt(string.length() - i - 1) ) {	
					signal = true;
				}
				else {
					signal = false;
					break;
				}
				
			}
			
			 
		}
		
		if ( signal ) {
			System.out.println( "Your string is a palindrome!" );
		}
		else
			System.out.println( "Your string is not a palindrome!" );

	}
	
	// You need to write a simple Java program to check if a given Integer is palindrome or not.

	
	private static void palindromeInteger(int number) {
		
		System.out.println("Checking this number: " + number);

		
		if ( number <= 0 ) {
			System.out.println( "Your number must be greater than 0!" );
			return;
		}
		
		else {
			
			int[] array = new int[] { number };
			
			//System.out.println( Arrays.toString(array) );
			
			String checkArray = Arrays.toString(array);
			
			for (int i = 1; i < checkArray.length()-1; i++) {			// from 1 and up to length -1 because array has brackets [ ... ]!
				
				if ( checkArray.charAt(i) != checkArray.charAt(checkArray.length() - i -1) ) {
					System.out.println( "Your number is not a palindrome!" );
					return;
				}
				
			}
			
		}
		
		System.out.println( "Your number is a palindrome!" );
		
	}
	
	// Find factoriel number (first variant)
	
	private static void factorielFirst(int number) {
		
		int factoriel = 1;
		
		for (int i = 1; i <= number; i++) {
			
			factoriel = factoriel * i;
			
		}
		
		System.out.println(  "FactorielFirst number from your number: " + number + " is " + factoriel );
		
	}
	
	// Find factoriel number (second variant)
	
	private static void factorielSecond(int number) {
		
		int mainNum = number;
		
		int factoriel = 1;
		
		while ( number != 0 ) {
			factoriel = factoriel * number;
			number--;
		}
		
		System.out.println( "FactorielSecond number from your number: " + mainNum + " is " + factoriel );
		
	}
	
	
	// Reverse a String
	
	private static void reverseString (String string) {
		
		String[] split = string.split("");

		System.out.println("Original string: ");
		for (int i = 0; i < split.length; i++) {
			
			System.out.print( split[i] + " " );
			
		}
		
		System.out.println();
				
		System.out.println( "Reversed string: " );
		for (int j = 0; j < split.length; j++) {
									
			System.out.print( split[split.length - j - 1] + " " );
			
		}
		
		System.out.println();
		
		System.out.println("Another way: ");

		StringBuilder sb = new StringBuilder(string);
		
		sb = sb.reverse();
		
		System.out.println( sb );
		
	}
	
	//  Remove duplicates from an array (generic method)
	
	private static <T> void removeDuplicatesFromList(T list) {
		
		System.out.println( "Original list: " + list );
		
		@SuppressWarnings({ "unchecked" })
		List<T> lista = (List<T>) list;
			
		System.out.println( "List without duplicates is: " );
		System.out.print( lista.stream().distinct().collect(Collectors.toList()) );
		
		System.out.println();
		System.out.print( "Another way:" );
		
		LinkedHashSet<T> setWithoutDuplicatesByDefault = new LinkedHashSet<T>(lista);
		System.out.println( setWithoutDuplicatesByDefault );

	}
	
	/* 	 pyramidPattern1
	 * You need to write a Java program to print above pyramid pattern. 
	 * How many levels the pyramid triangle would have will be decided by the user input.
	 */
	
	private static void pyramidPattern() {
		
		
	  /*
	   * 
	   * * 
	   * * * 
	   * * * * 
	   * * * * * 
	 */
		
		System.out.print("How many levels do you want this pyramid to have: ");
		
		try {
			@SuppressWarnings("resource")
			Scanner in = new Scanner(System.in);
			int number = in.nextInt();
			
			for (int i = 0; i < number; i++) {		// i = 0 ; 0 < 3;	(*)	||		i  = 1; 1 < 3;		(*)
				System.out.print( " * " );	
				for (int j = 0; j < i; j++) {		// j = 0 ; 0 < 0		||		j = 0;  0 <  1; 	(*)
					System.out.print(" * ");	
				}
				System.out.println();				// new line				||		new line	
			}
									
		} catch (InputMismatchException ime) {
			throw new InputMismatchException("You have to write a number, not a character!");
		}
		
		
	}
	
	/* 	 pyramidPattern2
	 * You need to write a Java program to print above pyramid pattern. 
	 * How many levels the pyramid triangle would have will be decided by the user input.
	 */	
	
	private static void pyramidPattern2() {
		
		
	/*
			 * 
			* * 
		   * * * 
		  * * * * 
		 * * * * * 
	*/
		
		System.out.print("How many levels do you want this pyramid to have: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int number = Integer.parseInt(br.readLine());	// 5 for example;			||   new line;
			
			for (int i = 0; i < number; i++) {
				
				System.out.println();
				
				for (int j = 0; j < number - i; j++) {
					System.out.print("  ");					// print 5 spaces;			|| print 4 spaces;
				}
				
				for (int k = 0; k < i + 1; k++) {			// print *;					|| print * *;
					System.out.print( "  * " );
				}
			
			}
			
			br.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.err.println( e );
		} 
		
		
	}

	// Find duplicates in a string 
	
	private static void findDuplicateCharactersInString(String s) {

		if (s == null || s.strip().length() == 0) {
			throw new NullPointerException("String cannot be null or empty!");
		} else {

			char[] characters = s.toCharArray();
			
			Map<Character, Integer> map = new HashMap<Character, Integer>();
			for (char c : characters) {
	            if(map.containsKey(c)) {
	                int counter = map.get(c);
	                map.put(c, ++counter);
	            } else {
	                map.put(c, 1);
	            }
			}
			
			System.out.printf("List of duplicate characters in String '%s' %n", s);

			for (char c : map.keySet()) { 
				if ( map.get(c) > 1 ) {
					System.out.println( "Number of appearances: " + map.get(c) + " -> " + " letter: " + c );
				}
			}
			
			System.out.println();
			
//			System.out.println("Map entry:");
//			for (Entry<Character, Integer> c : map.entrySet()) {
//				System.out.println( c.getKey() + " <-> " + c.getValue() );
//			}

		}

	}
	
	// Reverse array elements variant 1
	
	private static void reverseArray(int[] array) {			
		
		System.out.println( "Original array: " + Arrays.toString(array) + "\n" );
		
		
		for (int i = 0; i < array.length/2; i++) {						
			System.out.print( " old element: " + array[i] );
			int temp = array[i];										
			array[i] = array[array.length - i - 1 ];
			array[array.length - i - 1 ] = temp;
			System.out.print( " new element: " + array[i] );
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println( "New reversed array: " + Arrays.toString(array) );
		
	} 
	
	// Reverse array elements variant 2
	
	private static void reverseArray2(int[] array) {
		
		System.out.println( "Original array: " + Arrays.toString(array) + "\n" );

		
		int[] copy = array.clone();		// OR	copy = new int[array.length];
		
		for (int i = 0; i < array.length; i++) {
			copy[i] = array[array.length - i -1];
		}
		
		System.out.println( "New reversed array: " );

		
		for (int element : copy) {
			System.out.print( element + ", ");
		}

	}
	
	// Reverse word in a sentence
	
	private static void reverseWordsInSentence(String sentence) {
		
		assert sentence != null && sentence.strip().length() != 0;			// activate assertions in run configurations!
		
		String[] split = sentence.split("\\s");
		
		System.out.print( "Original sentence: \t " );
		for (int i = 0; i < split.length; i++) {
			System.out.print( split[i] + " " );
		}
		
		System.out.println();
		
		System.out.print( "Reversed sentence: \t " );
		for (int i = 0; i < split.length; i++) {
			System.out.print( split[split.length - i - 1] + " " );
		}
		
		System.out.println();
	}
	
	 // Leap year or not?

	private static void isLeapYear(int year) {
		
		System.out.println( "Checking this year: " + year );
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		
		int noOfDays = cal.getActualMaximum(Calendar.DAY_OF_YEAR);
		
		if ( noOfDays > 365 ) {
			System.out.println("This is a leap year!");
		}
		else
			System.out.println("This is not a leap year!");
		
	}
	
	// 	 binary search of an element in a sorted array! where we check either first or the second half depending whether numberToBeFound is larger or smaller than the middle value of an array!
	
	private static int binarySearch(int[] array, int numberToBeFound) {
		
		System.out.println("Trying to find number " + numberToBeFound + " in this array: " + Arrays.toString(array) + "\n");
		
		if ( array == null || array.length == 0  )
			throw new NullPointerException("Array cannot be empty!");
		else {
			
			
			int beforeMiddle = 0;
			int afterMiddle = array.length / 2;

			if (numberToBeFound > beforeMiddle) {						 // 5 > 2

				for (int i = afterMiddle; i < array.length; i++) {

					if (array[i] == numberToBeFound) {
						System.out.println("Number " + numberToBeFound + " is located after the middle of the array \nand it has been found in this place: " + (i+1) );
						return numberToBeFound;
					}

				}
			}
			
			if ( numberToBeFound < afterMiddle ) {					// 5 < 2
								
				for (int i = 0; i < afterMiddle; i++) {
					
					if (array[i] == numberToBeFound) {
						System.out.println("Number " + numberToBeFound + " is located before the middle of the array \nand it has been found in this place: " + (i+1) );
						return numberToBeFound;
					}

				}
				
			}
			
			
		}
		System.out.println(numberToBeFound + " is not in the array!");
		return -1;
	}
	
	// Anagram variant 1
	
	private static boolean anagramOrNot(String s1, String s2) {
		
		
		
		if ( s1 != null && s2 != null && s1.length() != 0 && s2.length() != 0  ) {
			
			System.out.println("Checking these words: " + s1 + " and " + s2);
			
			StringBuilder sb = new StringBuilder(s2).reverse();
			
		
			return s1.equalsIgnoreCase(sb.toString()) ? true : false;
			
		}
		else {
			System.err.println( "Provide real strings please!" );
			return false;
		}
		
	}
	
	// Anagram variant 2
	
	 private static boolean anagramOrNot2(String s1, String s2) {			
	 			
			System.out.println("Checking these words: " + s1 + " and " + s2);

		 
		 char[] s1ToCharArray = s1.toCharArray();
		 char[] s2ToCharArray = s2.toCharArray();
		 
		 Arrays.sort(s1ToCharArray);					
		 Arrays.sort(s2ToCharArray);
		 
		 return Arrays.equals(s1ToCharArray, s2ToCharArray) ? true : false;
			
 	}

	
	// Swap number without temporary variable
	 
	private static void swapNumberWithoutTemporaryVariable(int firstNum, int secondNum) {
		
		if ( firstNum != 0 && secondNum != 0 ) {			// firstNum = 5 ; secondNum = 8;
			
			System.out.println( "BEFORE: FirstNum = " + firstNum + " ; SecondNum = " + secondNum );
			
			firstNum = firstNum + secondNum;			// firstNum = 13;
			secondNum = firstNum - secondNum;			// secondNum = 5;
			firstNum = firstNum - secondNum;			// firstNum = 8;
			
			
			System.out.println( "AFTER: FirstNum = " + firstNum + " ; SecondNum = " + secondNum );

			
		}
		else
			System.out.println( "First or secondNum is 0!" );
		
	}
		
}
