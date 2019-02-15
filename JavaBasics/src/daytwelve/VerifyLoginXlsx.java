package daytwelve;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import javax.swing.text.html.HTMLDocument.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class VerifyLoginXlsx 
{
	public String [][] readXLSXFile()throws IOException 
	{
		String fp="D:\\Selenium\\Training\\Day12\\pptblackboardprogramsjan30\\Login.xlsx";
		InputStream XlsxFileToRead = null;
		XSSFWorkbook workbook = null;
		String[][] uservalue =new String[10][10];//fixed length array.....
		
		
	
			XlsxFileToRead = new FileInputStream(fp);
			
			//Getting the workbook instance for xlsx file
			workbook = new XSSFWorkbook(XlsxFileToRead);
		

		//getting the first sheet from the workbook using sheet name. 
		// We can also pass the index of the sheet which starts from '0'.
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		XSSFRow row;
		XSSFCell cell;
		
		
		//Iterating all the rows in the sheet
		java.util.Iterator<Row> rows = sheet.rowIterator();
       
         int i =0;
		while (rows.hasNext()) {
			row = (XSSFRow) rows.next();
			
			//Iterating all the cells of the current row
			java.util.Iterator<Cell> cells = row.cellIterator();
			int j=0;
			while (cells.hasNext()) {
				  
				cell = (XSSFCell) cells.next();
            
				if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING) {
					
					//System.out.print(cell.getStringCellValue() + " ");
				
			        uservalue[i][j] =cell.getStringCellValue();
							
					
				} else if (cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
					System.out.print(cell.getNumericCellValue() + " ");
				} else if (cell.getCellType() == XSSFCell.CELL_TYPE_BOOLEAN) {
					System.out.print(cell.getBooleanCellValue() + " ");

				} else { // //Here if require, we can also add below methods to
							// read the cell content
							// XSSFCell.CELL_TYPE_BLANK
							// XSSFCell.CELL_TYPE_FORMULA
							// XSSFCell.CELL_TYPE_ERROR
				}
				
				j=j+1;
			
			}
			System.out.println();
		    i=i+1;
		
				XlsxFileToRead.close();
		
		}
		return uservalue;
	}
	public static void verifyloginpage(WebDriver driver,String username ,String password) throws InterruptedException{
		
        String expTitle="OrangeHRM - New Level of HR Management";
		
       	driver.get("http://apps.qaplanet.in/qahrm");
       // driver.get("http://classroom:90/qahrm/login.php");
		String actualTitle=driver.getTitle();
		//driver.manage().window().maximize();
		//verify page title........
		if(actualTitle.equals(expTitle)){
			System.out.println("HomePage opened successfully");
		}
		//Enter userName and Password and click on the Login button....
		driver.findElement(By.name("txtUserName")).sendKeys(username);
		
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.name("Submit")).click();
		 
		// verify the welcome message and also the Logout link ....
		Thread.sleep(3000);
		
		WebElement logOut=driver.findElement(By.linkText("Logout"));
		
		if(logOut.isDisplayed()){
			System.out.println("Logout link is displayed, so the test case is passed" );
		}
		logOut.click();
				
	}
		
	public static void main(String[] args) throws IOException ,InterruptedException {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\class room\\Downloads\\geckodriver.exe");*/
		 WebDriver driver=new ChromeDriver();
		 
		 VerifyLoginXlsx readXlsx = new VerifyLoginXlsx();
		 String [][] uservaluea;
		 
		//fetch the values from the xlsx file and put them in the String array uservaluea...  
		 uservaluea =readXlsx.readXLSXFile();
		 	 
	     int i = 0;
	     int j = 0;
	     
		while(uservaluea[i][j]!=null){			
					
				verifyloginpage(driver,uservaluea[i][j] ,uservaluea[i][j+1]);
			   
			    i=i+1;
		}
		driver.quit();
		//driver.close();
  }
}

