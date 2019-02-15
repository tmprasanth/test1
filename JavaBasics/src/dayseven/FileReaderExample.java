package dayseven;
import java.io.*;
public class FileReaderExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("D:\\Selenium\\Training\\Day7\\Wordreader.doc");
        int i=0;
        while((i=fr.read())!=-1) {
        	System.out.print((char)i);
        }
        fr.close();
	}

}
