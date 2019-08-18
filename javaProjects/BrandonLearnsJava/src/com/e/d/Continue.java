package com.e.d;

public class Continue {

	// continue is a keyword like break -- it has to do with flow control of a loop
	// continue tells a loop to stop where it is in the loop and just skip ahead to the next iteration

	// example
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (isEven(i)) {
				continue; // skip to next iteration, so we only print out odd numbers
			}
			System.out.println(i);
		}
	}

	private static boolean isEven(int i) {
		return i % 2 == 0;
	}

}
