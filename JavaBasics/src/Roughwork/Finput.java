package Roughwork;

import java.io.*;

public class Finput {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fin=new FileInputStream("D:\\Selenium\\Training\\Day12\\pptblackboardprogramsjan30\\Login.xlsx");
		int i=0;
		while((i=fin.read())!=-1)
		{
			System.out.print((char)i);
		}
		fin.close();
	}

}
