package daytwelve;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Readxlsx {
	public void read(String fileName) throws IOException {
		InputStream x = new FileInputStream(fileName);
		XSSFWorkbook w = new XSSFWorkbook(x);
		
		//x = new FileInputStream(fileName);
			
			//Getting the workbook instance for xlsx file
			//w = new XSSFWorkbook(x);
		

		//getting the first sheet from the workbook using sheet name. 
		// We can also pass the index of the sheet which starts from '0'.
		XSSFSheet sheet = w.getSheet("Sheet1");
		XSSFRow row;
		XSSFCell cell;
		
		
		//Iterating all the rows in the sheet
		java.util.Iterator<Row> rows = sheet.rowIterator();

		while (rows.hasNext()) {
			row =   (XSSFRow) rows.next();
			
			//Iterating all the cells of the current row
			java.util.Iterator<Cell> cells = row.cellIterator();

			while (cells.hasNext()) {
				cell = (XSSFCell) cells.next();

				if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING) {
				   System.out.print(cell.getStringCellValue() + " ");
							}
			}
			System.out.println();  //creates a new row after printing a row..
			
				x.close();
			}			
	}		
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Readxlsx obj = new Readxlsx();
		obj.read("D:\\Mahesh\\Login.xlsx");
		
	}
}
