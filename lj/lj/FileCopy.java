package lj;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	
	public static void main(String[] args) throws IOException
	{
		FileInputStream fileInputStream = new FileInputStream("C:/Users/Trader/temp/moby_dick.txt");
		FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/Trader/temp/moby_dick_javaCopy.txt");
		
		while (fileInputStream.available() > 0)
		{
			int data = fileInputStream.read();
			fileOutputStream.write(data);
		}
		
		fileInputStream.close();
		fileOutputStream.close();
	}

}
