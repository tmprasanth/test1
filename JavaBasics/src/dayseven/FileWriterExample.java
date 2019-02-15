package dayseven;
import java.io.*;
public class FileWriterExample {

	public static void main(String[] args) throws IOException {
		FileWriter fw= new FileWriter("E:mahesh.doc");
		fw.write("Mahesh teaches Selenium");
		fw.close();
		

	}

}
