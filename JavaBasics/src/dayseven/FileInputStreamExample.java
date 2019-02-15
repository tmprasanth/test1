package dayseven;
import java.io.*;
public class FileInputStreamExample {

	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("D:\\Selenium\\Training\\Day7\\JavaJan24.txt");
        int i=0;
        while((i=fin.read())!=-1) {
        	System.out.print((char)i);
        }
	}

}
