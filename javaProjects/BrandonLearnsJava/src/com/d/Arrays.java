package com.d;

public class Arrays {

	// Whereas Python has lists, Java has both Arrays and Lists (we'll get to Lists later)

	//  Arrays are a built-in data structure. They are declared with the syntax
	//  <type>[] <name>
	int[] i1; // this is an array of ints

	//	  that is the left side of the expression.  There are two ways to declare the right side
	//	  1. declaring an array with default values, just setting the size
	int[] i2 = new int[5]; // an array of 5 ints

	//	  2. declaring an array with specified values
	int[] i3 = new int[] { 0, 3, 17, -2, 45 };
	// NOTE while the "new int[]" part of the right side is optional, it's customary to include it

	// Whereas python's lists could hold data of any type, Java's Arrays hold only the one type
	// Python: l = [4, 'l', 0] // valid 
	// Java: int[] i4 = { 1, -4, "a"}; // invalid

	// Whereas python's lists were mutable in size, Java's Arrays are a fixed size
	// Python: l = []; l.append('5') # results in l == ['5']
	// Java has no append or extend method
	// To resize an array, one way is to make a new array of the larger size and copy over previous entries
	
}
