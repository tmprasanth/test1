	package dayseven;
import java.io.*;
public class FileOutputStreamExample {

	public static void main(String[] args) throws IOException {
		FileOutputStream fout = new FileOutputStream("D:\\Selenium\\Training\\Day7\\Fileinput.txt");
		String s = "Hello everybody there in Qaplanet!";
		
		byte b[]=s.getBytes();
        fout.write(b);
        fout.close();
	}

}
