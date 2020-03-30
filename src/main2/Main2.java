package main2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.OptionalInt;
import java.util.Scanner;



public class Main2 {

	public static void main(String[] args) {
		
		System.out.println("*** REVERSING A NUMBER *** \n");
		
		reverseNumber(30450);
		
		System.out.println(); System.out.println();
		
		System.out.println("*** FINDING A FIRST NON_REPEATED CHARACTER IN A STRING *** \n");
		
		findFirstNon_RepeatedCharacterInAString("swiss");		
		
		System.out.println(); System.out.println();
		
		System.out.println("*** ARRAY SORT (FIRST VARIANT) *** \n");
		
		sortArrayElements(new int[] {2,1,5,0,-6});
		
		System.out.println(); System.out.println();
		
		System.out.println("*** ARRAY SORT (SECOND VARIANT) *** \n");

		insertionSort( new int[] {2,-2,15} );
		
		System.out.println(); System.out.println();
		
		System.out.println("*** INSERTION SORT WITH NEW ELEMENT *** \n");
		
		insertionSortWithNewElement( new int[] {1,5,2}, 4 );
		
		System.out.println(); System.out.println();
		
		System.out.println("*** JAVA MATRIX *** \n");

		createAMatrix();
		
		System.out.println(); System.out.println();
		
		System.out.println("*** REVERSE A STRING DIRECTLY *** \n");

		System.out.println( reverseAStringDirectly("1234") );
		
		System.out.println(); System.out.println();
		
		System.out.println("*** SUBTRACT TWO MATRICES *** \n");

		subtractTwoMatrices();
		
		System.out.println(); System.out.println();
		
		System.out.println("*** WHITE SPACE REMOVAL *** \n");

		removeAllWhiteSpace("   wo rd     ");
		
		System.out.println(); System.out.println();
		
		System.out.println("*** SORTING OF ANY LIST *** \n");

		LinkedList<String> list = new LinkedList<String>(List.of("Bob", "Chantelle", "Anna"));
		
		sortAnyList(list);
		
		System.out.println(); System.out.println();
		
		System.out.println("*** JAVA BUBBLE SORT *** \n");
		
		arraySort(new int[] {10, 50, 20, 80});
		
		

	}

	// Reverse a number of any length.
	
	private static void reverseNumber(int number) {
		
		if ( number <= 0 || String.valueOf(number).length() <=1  ) {
			System.err.println("Number has to have 2 values and it must be bigger than 0!");
		}
		else {
						
			String s = String.valueOf(number);
																	// Or with char (see below)
//			StringBuilder sb = new StringBuilder(s);
//			
//			sb.reverse();
//			
//			System.out.println( sb );
			
			System.out.println( "\n Original number: " +  String.valueOf(number) );

			
			char[] n = s.toCharArray();								
			
			for (int i = 0; i < n.length/2; i++) {						// Going only to the half of the charArray
																			
				
				char temp = n[i];										
				n[i] = n[n.length - i - 1];						
				n[n.length - i - 1] = temp;										
				
				System.out.println( (i+1) + ". element " + " = " + n[i] );
				
			}
			
			
			System.out.println( "\n Reversed number: " +  String.valueOf(n) );
			
		}
		
	}
	
	// Find first non-repeated character in a string.
	
	private static void findFirstNon_RepeatedCharacterInAString(String s) {						
		
		
		if ( s == null || s.strip().length() == 0 ) {
			throw new NullPointerException("String cannot be null!");
		}
		else {															//  Go through array as many times as the array itself holds elements.
																		//  Look for a passe where there is only 1 same element in itself and conclude a break
			char[] charArray = s.toCharArray();							
			char foundLetter = ' ';
			int numberOfSameElements = 0;
			
			System.out.println( "String: " + String.valueOf(charArray) + "\n" );
			
			for (int i = 0; i < charArray.length; i++) {
				
				numberOfSameElements = 0;
				
				for (int j = 0; j < charArray.length; j++) {
					
					if ( charArray[i] == charArray[j] ) {
						System.out.println(  charArray[i] + " = " + charArray[j] + " SAME " );
						numberOfSameElements++;
						foundLetter = charArray[j];
					}
					else {
						System.out.println(  charArray[i] + " = " + charArray[j] + " NOT SAME " );
					}

		
				}
				
				System.out.println( "\t Number of same elements: " + numberOfSameElements );
				
				if ( numberOfSameElements == 1 ) {
					break;
					
				}

				
			}
			
			if ( numberOfSameElements == 1 )
				System.out.println( "\t First letter that occurs only once in the whole string is: " + foundLetter  );
			else
				System.out.println("\t There is no letter which appears only once!");
			
			
		}
		
	}
	
	// Sort array (first variant).
	
	private static <T> void sortArrayElements(int[] array) {
		
		System.out.println("Sorting:");
		int sortingStep = 1;
		for (int i = 0; i < array.length; i++) {							
			
			for (int j = 0; j < array.length; j++) {
				
				
				int temp;
					
				if ( array[i] < array[j] ) {										
					temp = array[i];															
					array[i] = array[j];														
					array[j] = temp;	
									
					System.out.println( "sorting step: " + sortingStep + ": " + Arrays.toString(array) );
					sortingStep++;

				}			
				
			}
			
			
		}
		
		System.out.println( "\n Sorted array: " +  Arrays.toString(array) );

		// Should we want a descending sort, just change above line to ->  array[i] > array[j]
		
	}
	
	// Sort array (second variant).
	
	public static void insertionSort(int[] unsorted) {	
		
		System.out.println("Before sorting: " + Arrays.toString(unsorted));
		
		for (int i = 1; i < unsorted.length; i++) {
			int current = unsorted[i];								
			int j = i;													
			while ( j > 0 && unsorted[j - 1] > current) {					
				unsorted[j] = unsorted[j - 1];							
				j--;													
			}
			unsorted[j] = current;										
		}
		
		System.out.println( "After sorting: " + Arrays.toString(unsorted) );
		
	}
	
	
	// Insert new element in array and sort the array afterwards.
	
	public static void insertionSortWithNewElement(int[] array, int numberToBeAdded) {
		
		System.out.println( "Before sorting: \n" + Arrays.toString(array) );

		
		array = Arrays.copyOf(array, array.length+1);			// Copying the same array to a length of array+1
		
		System.out.println("Before sorting (with new number added): ");
		
		
		array[array.length-1] = numberToBeAdded;			// New element is automatically added in the last position of the array
															// Make that last position of the array hold the number that is to be added to the array
			
			
			System.out.println( Arrays.toString(array) );

			
		
		
		System.out.println( "\nSorting...:" );								
		
		for (int i = 0; i < array.length; i++) {
			
			for (int j = 0; j < array.length; j++) {
				
				if ( array[i] < array[j] ) {												
					int temp = array[j];													
					array[j] = array[i];																
					array[i] = temp;											
					
					System.out.println( Arrays.toString(array) );
				}
				
			}
			
		}
		
		System.out.println( "\nAfter sorting:" );
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.print( array[i] );
			
			if ( i != array.length -1 ) {
				System.out.print( ", " );
			}
			else
				System.out.println( " and that's it!" );
			
		}
		
		
		
		
	}
	
	// Create a matrix with scanner and print it. Print also transposed matrix.
	
	private static void createAMatrix() {
		
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println( "\t Welcome to Java Matrix!" );
			System.out.println( "Please enter number of rows: " );
			int rowsNum = sc.nextInt();
			System.out.println( "Please enter number of columns: " );
			int columnsNum = sc.nextInt();
			
			int[][] matrix = new int[rowsNum][columnsNum];
			
			System.out.println( "Now let's start filling the matrix!" );
			
			boolean endReached = false;

			while (!endReached) {

				for (int i = 0; i < rowsNum; i++) {
					for (int j = 0; j < columnsNum; j++) {
						
						System.out.print( "Enter a number for the: '" + (j+1) + "' element (row " + (i+1) + "): "   );
						int element = sc.nextInt();
						matrix[i][j] = element;
					}
					System.out.println( "\t COLUMN " + (i+1) + " over!" );
				}
				endReached = true;
			}
			
			
			System.out.println( "\n\t Original matrix: " );
			for (int i = 0; i < rowsNum; i++) {
				for (int j = 0; j < columnsNum; j++) {
					System.out.print( matrix[i][j] + " " );
				}
				System.out.println();
			}
			
			sc.close();
			
			
			if ( rowsNum == columnsNum ) {
			
			int tempMatrix[][] = new int[rowsNum][columnsNum];
			for (int i = 0; i < rowsNum; i++) {
				for (int j = 0; j < columnsNum; j++) {
					
					tempMatrix[i][j] = matrix[j][i];				// fill empty tempMatrix with trasponed elements from original matrix							
					
				}
			}
			matrix = tempMatrix;					// make original matrix have same elements as tempMatrix
			
			
			System.out.println( "\t Transposed matrix: " );
			for (int i = 0; i < rowsNum; i++) {
				for (int j = 0; j < columnsNum; j++) {
					
					System.out.print( matrix[i][j] + " " );					// show original matrix but in transponed fashion					
					
				}
				System.out.println();
			}
			
			
			}
			
			else
				System.out.println( "\t Transposed matrix won't work since number of rows and number of columns ain't same!" );			
			
			
		} catch (InputMismatchException ime) {
			System.out.println( "Error -> you must enter a number!" );
		}
		
		
	}
		
	// Reverse a string directly.

	private static String reverseAStringDirectly(String s) {
		
		
		if ( s.isEmpty() ) {
			throw new NullPointerException("Given string cannot be empty, sorry!");
		}
		else {
			
			System.out.println( "Original string: " + s );
			
			StringBuilder sb = new StringBuilder(s);
			
			for (int i = 0; i < sb.length()/2; i++) {
				
				char temp = sb.charAt(i);							
				sb.setCharAt(i, sb.charAt(sb.length()-i-1));		
				sb.setCharAt(sb.length()-i-1, temp);													
					
			}
			
			return "Reversed string: " + sb;
		}
		
	}
	
	// Subtract two given matrices and print them
	
	private static void subtractTwoMatrices() {
		
		int firstMatrix[][] = { 
								{ 1,2,3 },
								{ 4,5,6 },
								{ 8,7, 3 }
		
										};
		
		int secondMatrix[][] = { 
								 { 0,2,0 },
								 { 1,1,2 },
								 { 7,-2, -1 }

										};
		
		System.out.println( "First matrix:  " + Arrays.deepToString(firstMatrix) + "\n");
		System.out.println( "Second matrix: " + Arrays.deepToString(secondMatrix) + "\n" );
		
		
		int resultMatrix;
		
		System.out.println( "Subtraction of two given matrices:" );
		for (int i = 0; i < firstMatrix.length; i++) {
			for (int j = 0; j < secondMatrix.length; j++) {
				
				resultMatrix = firstMatrix[i][j] - secondMatrix[i][j];
				System.out.print( resultMatrix + " " );
				
			}
			System.out.println();
		}
		

		
		
	}
	
	// Remove all white space from string		

	private static void removeAllWhiteSpace(String s) {
		
		
		assert s != null && s.strip().length() != 0;
		
		
		StringBuilder sb = new StringBuilder();
		int currentIndexElement = 0;
		char whiteSpace = ' ';
		int numberOfWhiteSpaces = 0;
		
		while ( currentIndexElement != s.length() ) {
			
			char c = s.charAt(currentIndexElement);
			
			if ( c != whiteSpace ) {
				sb.append(c);
			}
			
			else
				numberOfWhiteSpaces++;

			
			
			currentIndexElement++;

		}
				
		System.out.println( "In string ->'"+s+"'<- there are " + numberOfWhiteSpaces + " white spaces." );
	
				
		System.out.println( "String ->'"+s+"'<- with all white spaces removed looks like this: " + "-" + sb + "-");

		
	}
	
	// Sort any list (generic method)
	
	private static void sortAnyList(List<String> list) {
		
		
		System.out.println( "Before sorting our list looks like this: " + list );
		
		Collections.reverse(list);
		
		System.out.println( "\tAfter reversing our list looks like this: " + list );

		
		Comparator<String> comparatorByLength = Comparator.comparing(String::length);	
				
		list.sort(comparatorByLength);
		
		System.out.println( "\tAfter sorting by name length (ascending) our list looks like this: " + list );
		
		Comparator<String> comparator = new Comparator<String>() {

			@Override
			public int compare(String first, String second) {
				//return second.length() - first.length();   // OR just like below
				return Integer.compare(second.length(), first.length());
			}
		};
		
		list.sort(comparator);
		
		System.out.println( "\tAfter sorting by name length (descending) our list looks like this: " + list );

		
	}
	
	private static void arraySort(int arr[]) {		// 10, 50, 20, 80, 50
		
		OptionalInt max = Arrays.stream(arr).max();			// find biggest array number
		
		int min = Arrays.stream(arr).min().getAsInt();
		
		
		
		int[] count = new int[max.getAsInt() + 1];			// return int value of max number and increase it by 1
		
		for (int i = 0; i < count.length; i++) {			// fill new array with all 0
			count[i] = 0;
		}
		
		int n = arr.length;									// n = 5;
		
		for (int i = 0; i < n; i++) {
			count[ arr[i] ] = 1;							// same as: count [ arr[i] ] +=1;	or 		count [ arr[i] ] ++	   ; count[10] = 1; count[50] = 1;  etc.
			System.out.println( count[ arr[i] ] );			// count[ arr[0] ] -> count[10] -->> so 10th element will have value 1 ; count[ arr[1] ] -> count[50] -->> so 50th element will have value 1 ...
		}
		
		System.out.println( Arrays.toString(count) );
		
		
		
		
        // Change count[i] so that count[i] now contains actual 
        // position of this character in output array 
        for (int i=1; i < count.length; i++) 
        	count[i] = count[i] + count[i-1];				// count[0] = 0 + 0; ... count[10] = count[10] + count[9] -> 1 + 0 => 1;
        
		System.out.println( Arrays.toString(count) );

		
		int[] output = new int[n];				// output array that will sort arr array

        
        for (int i = 0; i < output.length; i++) {
        	output[count[arr[i]]-1] = arr[i];						// output[ count[ arr[0]] -1 ] = arr[0];  output[ count [10] - 1  ] = 10;  output[1-1] = 10;	output[0] = 10;
		}

        

        System.out.println( Arrays.toString(output) );
        
        
//        for (int i = 0; i < n; i++) {					// copy elements from output array to our original array
//			
//        	arr[i] = output[i];
//        	
//		}
		
        arr = Arrays.copyOf(output, output.length);		 // copy elements from output array to our original array OR like above 
        
        arr[0] =min;
        
        System.out.println( "Finally, our original sorted array is: " + Arrays.toString(arr) );
        
		 }


	
	
	
		
	}


	
		
		

		



	
	



