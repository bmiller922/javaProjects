package lj;
import java.io.IOException;

public class Task1 {
	
	private static String TEXT = "new phone who dis?";
	
	public static void printTextMoreTimes(String s, int count) {
		for (int i = 0; i < count; i++) {
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) throws IOException {
		System.out.println(TEXT);
		/*
		 * this is a multi line comment
		 * the code witll display three identical strings
		 */
		String s = "yo-yo-yo";
		printTextMoreTimes(s, 3);
		}
	
		
	}

