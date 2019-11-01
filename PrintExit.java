package lj;
import java.io.*;

public class PrintExit {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		boolean isExit = false;
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		while(!isExit) {
			String s = buffer.readLine();
			System.out.println(s.toUpperCase());
			isExit = s.equals("exit");
		}

	}

}
