package dataDrivenTesting;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileRead {

	public static void main(String[] args) throws Throwable {
		
		//Step:1 Open the document in the java Readable format
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
		
		//Step:2 Create a Work Book
		Workbook wb = WorkbookFactory.create(fis);//workbook interface having abstract methods
		    //Workbook factory having static method create returning workbook methods are overloaded
		
		//Step:3 Navigate to the required sheet
		Sheet sh = wb.getSheet("Sample");
		
		//Step:4 Navigate to the required row
		Row rw = sh.getRow(1);
		
		//Step:5 Navigate to the required cell
		Cell ce = rw.getCell(2);
		
		//Step:6 Capture the data inside the cell
		String data = ce.getStringCellValue();
		System.out.println(data);
		
		
		
	}
}
