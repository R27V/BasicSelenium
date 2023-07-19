package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileWrite {

	public static void main(String[] args) throws Throwable {
		
         //Step:1 Open the document in java readable format
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
		
		//Step:2 Create a Work book
		Workbook wb = WorkbookFactory.create(fis);
		
		//Step:3 Navigate to Sheet
		//Sheet sh = wb.getSheet("Sample");
		Sheet sh = wb.createSheet("Trial");
		
		//Step:4 Navigate to Row
		Row rw = sh.createRow(3);
		
		//Step:5 Navigate to cell
		Cell c1 = rw.createCell(4);
		
		//Step:6 set the data to be written
		c1.setCellValue("Renu");
		
		//Step:7 Open the document in java write format
		FileOutputStream fos = new FileOutputStream(".\\src\\test\\resources\\TestData.xlsx");
		wb.write(fos);
		
		System.out.println("data added");
		
		
		
		
		
	}
}
