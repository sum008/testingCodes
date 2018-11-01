package readingExcelFilesUtil;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {
	
	public static String sheetname = "testSheet" ;
	
	public static String sheet_path = "C:\\Users\\Sumit\\eclipse-workspace\\TestNG\\src\\readingExcelFilesUtil\\testSheet.xlsx" ;
	
	public static Object[][] getData(String sheetname) throws Throwable{
		
		FileInputStream file = null;
		

			
			file = new FileInputStream(sheet_path) ;
		
		

			 Workbook	book = WorkbookFactory.create(file);
			 Sheet	sheet = book.getSheetAt(0);
			
		
		
		
		
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for(int row = 0; row<sheet.getLastRowNum(); row++) {
			
			for(int cell = 0; cell<sheet.getRow(0).getFirstCellNum(); cell++) {
				
				data[row][cell] = sheet.getRow(row+1).getCell(cell).toString();
				
				System.out.println(data[row][cell]);
				
			}
		}
		return data ;
		
		
		
		
	}
	
	public static void main(String args[]) throws Throwable {
		
		getData(sheetname);
	}

}
