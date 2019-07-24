import java.util.Scanner;

public class Sequence {

	public static void main(String[] args) {
		int count = 0;
		int num1 = 0;
		int num2 = 1;
		
		System.out.println("How many numbers do you want in the sequence?");
		Scanner scanner = new Scanner(System.in);
		count = scanner.nextInt() + 1;
		scanner.close();
		System.out.println("Fibonacci sequence of " + count + " numbers:");
		
		int i = 1;
		while(i<count)
		{
			System.out.print(num1 + " ");
			int sumOfPrevTwo = num1 + num2;
			num1 = num2;
			num2 = sumOfPrevTwo;
			i++;
		}

	}

}
