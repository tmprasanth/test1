package Roughwork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writeexcel2Prac {

	
	public static void main(String[] args) throws IOException 
	{
		
		File testfile=new File("D:\\Selenium\\Training\\TestData\\Sampletestdata.xlsx");
		FileInputStream fin=new FileInputStream(testfile);
		XSSFWorkbook wb=new XSSFWorkbook(fin);
		XSSFSheet usersheet=wb.getSheetAt(0);
		
		int noofrows=usersheet.getLastRowNum();
		System.out.println(noofrows);
		for(int i=1;i<=noofrows;i++)
		{
			usersheet.getRow(i).createCell(4).setCellValue("PASS");

			FileOutputStream fout=new FileOutputStream(testfile);
			wb.write(fout);
		}
		wb.close();
		
		
	}

}
