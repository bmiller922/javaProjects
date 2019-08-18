package com.e.a;

public class WhileLoops {

	public static void main(String[] args) {

		// Let's start with the while loop. These are identical to their Python
		// counterparts, except for the curly braces for the block

		// syntax: while (condition)
		// the condition may be a boolean expression or simply a boolean

		/*
		 * Python:
		 * i = 0
		 * while (i < 3)
		 *   print i
		 *   i = i + 1
		 */

		// Java
		int i = 0;
		while (i < 3) {
			System.out.println(i);
			i = i + 1;
		}

		while (true) {
			// do something
			break; // break the loop. We'll discuss this later
		}

	}

}
