package com.c;

public class Pencil {

	// Fields are traditionally at the very top of your class
	// Fields are variables that have the scope of the entire class
	private double bodyLength; // the length of our pencil in inches. This will decrease as we write with the pencil and sharpen it

	private boolean isSharp; // need this to know if we can write
	private int numCharactersWritten;

	// Constructor (traditionally at the top, below fields but above all methods)
	public Pencil() { // public because we want other people to be able to make a Pencil object. Constructors do not need to be public
		bodyLength = 6.5;

		isSharp = false; // pencil begins unsharpened

		// we'll use this to keep track of how many characters we write between sharpenings as a way of knowing whether the pencil is still sharp
		numCharactersWritten = 0; 
	}

	/**
	 * use pencil to write a character 
	 * if the pencil is not sharp, we cannot write anything
	 * 
	 * @param c the character we write
	 * @return whether the act of writing was successful
	 */
	public boolean write(char c) {
		if (!isSharp) {
			return false; // our pencil wasn't sharp, so we could not write
		}

		// if we've made it here, our pencil must be sharp.
		System.out.println(c);
		bodyLength -= 0.001; // the pencil gets progressively shorter as we write
		updateDull(); // the pencil gets progressively dull as we write
		return true; // we successfully wrote with the pencil
	}

	// private because this will only be called internally when we write, not by the user of this object
	// void because we don't need this to return a value
	private void updateDull() {
		if (numCharactersWritten == 500) {
			isSharp = false;
		}
	}

	/**
	 * Sharpens our pencil
	 * returns false if our pencil is too short to sharpen
	 * 
	 * @return whether we successfully sharpened the pencil
	 */
	public boolean sharpen() {
		int lengthLostBySharpening = 1;
		if (bodyLength <= lengthLostBySharpening) {
			return false;
		}

		bodyLength -= lengthLostBySharpening;
		isSharp = true;
		return true;
	}
	
}
