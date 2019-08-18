package com.d;

public class IfElse {

	public static void main(String[] args) {
		// if works just like python
		// syntax: if (condition) { stuff }
		int i = 0;
		if (i == 0) {
			System.out.println("i is 0");
		}

		// Python had the keyword elif. Java instead does "else if (condition)"
		if (i == 1) {
			System.out.println("i is 1");
		} else if (i == 0) {
			System.out.println("i is 0");
		} else {
			System.out.println("is is neither 0 nor 1");
		}

		// we'll discuss ternary syntax later
	}
}
