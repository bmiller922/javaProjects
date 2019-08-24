package lj;
import java.util.Random;

public class LuckyFive {
	
	public static void main(String[] args) {
		//create random number generator
		Random randomNumberGenerator = new Random();
		//generate a random number between 1 and 6
		int dieRoll = randomNumberGenerator.nextInt(6) + 1;
		System.out.println(dieRoll);
		//repeat while roll isn't 6
		while  (dieRoll != 6) {
			dieRoll = randomNumberGenerator.nextInt(6) + 1;
			System.out.println(dieRoll);
		}
	}

}
