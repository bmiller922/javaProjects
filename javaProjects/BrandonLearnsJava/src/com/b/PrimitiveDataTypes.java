package com.b;

public class PrimitiveDataTypes {

	/*
	 * Java has 8 primitive data types:
	 * 
	 * boolean
	 * 
	 * char (2 bytes)
	 * 
	 * byte (1 byte) short (2 bytes) int (4 bytes) long (8 bytes)
	 * 
	 * float (4 bytes) double (8 bytes)
	 * 
	 */

	// boolean: hold true/false values. has two keywords: true and false
	// (lowercase t/f)
	boolean bool1 = true;
	boolean bool2 = false;
	// you can perform operations on them, like
	// & (bitwise and)
	// && (short-circuiting and)
	// | (bitwise or)
	// || (short-circuiting or)
	// ^ (xor)
	// ! (not)
	// ***for the most part, you'll want to use the short-circuiting && and ||
	// over their bitwise counterparts***

	// char: typically used to hold a single readable character
	char c1 = 'a'; // NOTE the single quotation marks. Those are exclusive to
					// chars. Strings use double-quotes
	// char c2 = 'ab'; // THIS IS NOT VALID!!! There's only room for a single
	// character within the quotes
	// while the char is typically used for a human-readable character, it can
	// hold 2 byte's worth of values
	// therefore, this is valid:
	char c2 = 75; // equivalent to 'K'. Feel free to test by printing it out
	// consult http://www.asciitable.com/ for all unicode values of chars

	// byte: holds a number between -128 and 127
	byte byte1 = (byte) 1; // this cast is unnecessary here. We'll learn more
							// about masking and truncation later
	byte byte2 = 2;
	byte byte3 = -1;
	// byte byte4 = 138; // this is out of range because the byte is signed
	// (Java doesn't do unsigned variables)

	// short: like byte, just a larger format (-32768 to 32767)
	short short1 = 2452;

	// int: like byte and short, just larger (-2147483648 to 2147483647)
	int int1 = 156074;
	int int2 = 1_000_000; // NOTE underscores are allowed, and they often help
							// with readability of large numbers

	// long: like byte, short, and int, just larger (-2^63 to 2^63-1)
	long long1 = 1000000000;
	long long2 = 1_000_000_000;
	// numeric literals are interpreted as ints by default. So when you have a
	// number too large for an int, it must be specified
	// as a long, even on the right side of the expression. We do this with the
	// key 'L' (don't use lowercase -- while valid, it looks
	// too much like a 1)
	long long3 = 2147483648L;

	// float: used to represent floating point numbers (aka decimals) with 4
	// bytes
	// The values it can represent are beyond the scope of this lesson
	// use an f or F at the end of the number to declare it as a float. Decimals
	// are doubles by default
	float float1 = 0.1f;
	float float2 = 1.5F;

	// double: used to represent floating point numbers with 8 bytes
	// The values it can represent are beyond the scope of this lesson
	// use a d or D at the end of the number to specify it's a double
	double double1 = 3.14d;
	double double2 = 1.333D;

	//////////////////////////////////////////////////////////////////////////////////////////////////

	// Casting
	// Sometimes you have a value of one primitive data type, but you need it to
	// be a different type
	// Example: I get a value as a long, but I need to use it as an int
	// Casting allows you to change types with by specifying the new type,
	// surrounded by parentheses
	// Example:
	long l = 3;
	int i = (int) l;
	// Casting potentially has some loss of precision.
	// When casting to a smaller number of bytes, values can lose their largest
	// bits
	// When casting from a floating point to a floating point to an integer, the
	// decimal part is truncated
	// When casting from an integer to a floating point, there can potentially
	// be a loss of precision,
	// but that will only happen with super large numbers

	// Important math note:
	// Division: non-floating point (aka integer) numbers are capable of
	// division. However, the result will always
	// be a non-floating point type.
	// Example:
	int numerator1 = 1;
	int denominator1 = 3;
	int result1 = numerator1 / denominator1;
	// result1 will have a value of 0 (integer division truncates any decimal
	// part), even if we changed the type of result
	double result2 = numerator1 / denominator1; // result2 still equals 0
	// What we do instead is to cast one of the numbers as floating point before
	// the division happens
	// Example
	int numerator2 = 1;
	int denominator2 = 3;
	double result3 = (double) numerator2 / denominator2;

	// Mixed-type expressions
	// When we have two variables of different types, they can often be combined
	// The resulting value is of the more "general" type
	int ii = 1;
	long ll = 2;
	double dd = 2.5;

	// example: adding an int and a long
	// a long is more general than an int -- it can express any value an int
	// can, plus many more
	// int result4 = ii + ll; // invalid
	// long result4 = ii + ll; // valid
	// if you really want your result as an int, the two following ways can work
	// int result4 = ii + (int) ll; // valid, correct if the sum is small enough
	// to fit in an int
	// int result4 = (int) (ii + ll); // valid, correct if the sum is small
	// enough to fit in an int
	// if the sum of these two variables is larger than an int can hold, then
	// you're out of luck, and you
	// need to express the sum as a long

	// example: adding an int and a double
	// A double is more general than an int -- it can express both integer
	// values and decimals
	// Therefore, the result of adding a double and an int
	// int result5 = ii + dd; // invalid
	// double result5 = ii + dd; // valid
	// int result5 = ii + (int) dd; // valid, but potentially incorrect. this
	// trancates any decimal portion of dd (2.5 -> 2)
	// double result5 = (double) ii + dd; // valid, very likely correct
}
