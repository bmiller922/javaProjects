package lj;
//import java.util.Scanner;

import java.io.*;
import java.util.Scanner;

public class inputStreams {
	public static void main(String[] args) throws IOException {
		InputStream inputStream = System.in;
		Reader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		String name = bufferedReader.readLine(); //read a string from keyboard
		String sAge = bufferedReader.readLine(); // read a string from keyboard
		int nAge = Integer.parseInt(sAge); // convert the string to a number
		
		System.out.println("Hi " + name + " you are " + nAge + " years old!");
		
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		String name = reader.readLine();
//		String sAge = reader.readLine();
//		int nAge = Integer.parseInt(sAge);
//		//simpler
		
//		Scanner scanner = new Scanner(System.in);
//		String name = scanner.nextLine();
//		int age = scanner.nextInt();
//		//simpler still
		
		
	}

}
