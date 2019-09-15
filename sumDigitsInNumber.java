package lj;

import java.io.*;

public class sumDigitsInNumber {
	public static void main(String[] args) throws IOException {
		System.out.println("Input a number: ");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String num = bufferedReader.readLine();
		int length = num.length();
		int number = Integer.parseInt(num);
		System.out.println("You entered: " + number);
		System.out.println("it is " + length + " digits");
		System.out.println("The sum of the digits in your number is: " + sumDigits(number, length));
		bufferedReader.close();
	
				
	}
	
	public static int sumDigits(int number, int length) {
		int sum = 0;
		int placeholder = 1;
		for (int i = 1; i <= length; i++) {
			int digit = ((number)/placeholder) % 10;
			System.out.println(placeholder);
			System.out.println(digit);
			sum += digit;
			placeholder *= 10;
		}

		return sum;
	}

}
