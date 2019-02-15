package Roughwork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel2Prac {

	public static void main(String[] args) throws IOException 
	{
		File testfile=new File("D:\\Selenium\\Training\\TestData\\Sampletestdata.xlsx");
		FileInputStream Filestrm=new FileInputStream(testfile);
		XSSFWorkbook wb=new XSSFWorkbook(Filestrm);
		XSSFSheet testsheet=wb.getSheetAt(0);
		int rowcout=testsheet.getLastRowNum();
		
		System.out.println("Row Count------------>" +rowcout);
		
		for(int i=0;i<rowcout;i++)
		{
			//************GETS CELL COUNT************///////
			int colcount=testsheet.getRow(i).getLastCellNum();
			System.out.println("Column Count------------>" +colcount);
				for(int j=0;j<colcount;j++)	
					{
					//************Repeat the loop for all the rows and columns************///////	
					String userdata1=testsheet.getRow(i).getCell(j).getStringCellValue();
						//String userdata2=testsheet.getRow(i).getCell(1).getStringCellValue();
						System.out.println("Row-->" +i +"Coulmn---->" +j +"---->"+ userdata1);
						//System.out.println("Row-->" +i +"Coulmn=1---->" +userdata2);
					}
		
		}
		
	/*	String userdata11=testsheet.getRow(0).getCell(2).getStringCellValue();
		String userdata12=testsheet.getRow(15).getCell(0).getStringCellValue();
		String userdata13=testsheet.getRow(1).getCell(2).getStringCellValue();
		String userdata14=testsheet.getRow(2).getCell(2).getStringCellValue();
		System.out.println("getRow(0).getCell(2)----------->" + userdata11);
		System.out.println("getRow(15).getCell(0)----------->" + userdata12);
		System.out.println("getRow(1).getCell(2)----------->" + userdata13);
		System.out.println("getRow(2).getCell(2)----------->" + userdata14);*/
			

	}

}
