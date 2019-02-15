package Roughwork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelPrac {

	public static void main(String[] args) throws IOException 
	{
		File inputfile=new File("D:\\Selenium\\Training\\TestData\\Sampletestdata.xlsx");
		FileInputStream fin=new FileInputStream(inputfile);
		XSSFWorkbook wb=new XSSFWorkbook(fin);
		XSSFSheet sheetname=wb.getSheetAt(0);
		String data=sheetname.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
		wb.close();
		
		

	}

}
