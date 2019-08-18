package com.e.c;

public class Break {

	// the break keyword is not exclusive to loops. However, we'll first demonstrate it here
	
	// break is a keyword that indicates that we no longer want to continue iterating our loop, so it stops it right then and there

	public static void main(String[] args) {
		// example 1: ending a while-true loop
		// we've already seen this in the WhileLoops class
		while (true) {
			break;
		}
		// this helps us not get stuck in an infinite loop

		// example 2: terminating early
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
		// this will only print out 0-4, then exit the loop on 5

		// example 3: nested loop
		// "break" only ends the lowest level of the nesting, not the entire nested loop
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 3) { // we'll only print out digits 0-2 (0, 1, 2, 10, 11, 12, ...)
					break;
				}
				System.out.println((10 * i) + j);
			}
		}

	}
}
