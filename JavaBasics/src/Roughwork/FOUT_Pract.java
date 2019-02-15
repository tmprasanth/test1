package Roughwork;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOUT_Pract {

	public static void main(String[] args) throws IOException 
	{
		FileOutputStream fout=new FileOutputStream("D:\\Selenium\\Training\\Day7\\Fileout.txt");
		String s="Hello WOrld";
		byte b[]=s.getBytes();
		fout.write(b);
		fout.close();
				

	}

}
