package com.e.b;

public class ForLoops {

	public static void main(String[] args) {
		// For loops have 2 different possible syntaxes
		
		// Let's start with the standard one:
		for (int i = 0; i < 10; i++) {
			// do something 10 times
		}
		// this follows the for(<initialization>; <termination>; <increment>) pattern
		// that is
		// 1. we initialize a variable i, which we will use for our looping condition
		// 2. we state that the loop should end when it is no longer the case that i < 10
		// 3. between iterations of the loop, we increment i by 1
		
		//it's possible to get very creative with these. For example
		for (int i = 1; i < 100; i += 2) {
			// do something for each odd number between 1-99
		}
		for (int i = 10; i > 0; i--) {
			// count down from 10 to 1
		}
		for (char c = 'a'; c < 'z'; c++) { // remember that chars are just numbers
		}
		
		for (;;) { // this is equivalent to a while(true) loop
			break;
		}
		
		///////////////////////////////////////////////////////////////////////////////////////
		
		// Syntax # 2: for (<type> <name> : <collectionOfType<type>>) {}
		// often called "enhanced for"
		
		// In Python you typically loop for a specified number of times by using the "range" call
		// range is a special construct in Python that returns an array with particular entries
		int[] range10 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }; // equivalent to the python range(10) call
		
		//"enhanced for" example:
		for (int i : range10) {
			// do something 
		}
		// Do not do this. There's no need to create an array with 10 values each time you want to do something. Instead, use standard syntax
		
		// Something to note here: here we are actually looping over the values within the array.
		// That is, i is not the index of value in the array; rather, it is the value
		// to demonstrate this more clearly:
		char[] chars_a_i = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i' };
		for (char c : chars_a_i) {
			System.out.println(c); // this will print each char from a to i
		}
		
		// NOTE: this syntax loops through the collection in order
		// NOTE: there is no way to use this syntax to iterate backwards or by increments other than 1
		
	}
	
}
