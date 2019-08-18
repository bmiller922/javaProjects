package com.a;

public class MainMethod {

	/*
	 * The main method is the method that's called when you run your program in Java
	 * It has a specific signature. You can generate this for your self by typing main,
	 * ctrl+space, and selecting "main - main method".
	 * 
	 * It will look like this:
	 */

	public static void main(String[] args) {

	}

	/*
	 * A method is defined by its signature.
	 * In python you had "def <functionName>():"
	 * In java there is a differeny syntax.  The format is as follows:
	 * 
	 * <accessModifier> (static) <returnType> <methodName>(arguments) {}
	 * 
	 * Access Modifiers: We'll get to this later. It's essentially who has access to see/modify
	 * a class, method, or variable.
	 * The four are: public, private, protected, and default (lack of one) 
	 * 
	 * static (optional): defines whether the class/method/variable is related to a specific instance of a class
	 * In the case of methods, this means that a static method doesn't rely on any of the STATE of the object
	 * That means that the code can be run just from the incoming parameters without any other info
	 * The main method can be declared static because there are obviously no objects yet.
	 * We'll discuss static more later
	 * 
	 * return type: This can be a primitive data type (we'll discuss these soon), a class, or void.
	 * void (lowercase v) means that it does not return a value.  The main method (in Java) does not return a value
	 * 
	 * main. That's just the name
	 * 
	 * Arguments: Here you list the required parameters for your method.  Unlike python, optional/default arguments
	 * for a method signature aren't a thing.  However, there are ways to set default values. We'll get to that later
	 * main only has one argument: an array of Strings.
	 * main's String[] argument is special: it contains the initial arguments for your program
	 * If you were to run your program from the command line, these would be what followed "java <mainClass>"
	 * In Eclipse, you can set them in the Run Configurations (Right-Click > Run As > Run Configurations... > Arguments)
	 * 
	 * Unlike python's scope by indentation, the body of the method is all that's contained 
	 * within the curly braces {} 
	 */

}
