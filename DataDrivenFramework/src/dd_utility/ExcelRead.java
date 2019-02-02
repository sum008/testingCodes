package dd_utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Calendar;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	static XSSFWorkbook book;
    static Sheet sheet;
    static FileInputStream fis;
     String path ;
     int sheetNum;
     private  Row row=null;
     private Cell cell = null;
     
     public ExcelRead(String path) {
     	
     	this.path=path;
     	File file = new File(this.path);
	 		
	 		
	 		try {
	 			fis = new FileInputStream(file);
	 		} catch (FileNotFoundException e1) {
	 			// TODO Auto-generated catch block
	 			e1.printStackTrace();
	 		}
	 		
	 		 try {
	 			book = new XSSFWorkbook(fis);
	 		} catch (IOException e) {
	 			// TODO Auto-generated catch block
	 			e.printStackTrace();
	 		}
	    	}
     
     
  // returns the row count in a sheet
 	   public int getRowCount(String sheetName){
 		  
 		int index = book.getSheetIndex(sheetName);
 		if(index==-1)
 			return 0;
 		else{
 		sheet = book.getSheetAt(index);
 		int number=sheet.getLastRowNum()+1;
 		return number;
 		}
 		
 	}
	
 	  public String getCellData(String sheetName,String colName,int rowNum){
 			try{
 				if(rowNum <=0)
 					return "";
 			
 			int index = book.getSheetIndex(sheetName);
 			int col_Num=-1;
 			if(index==-1)
 				return "";
 			
 			sheet = book.getSheetAt(index);
 			row=sheet.getRow(0);
 			for(int i=0;i<row.getLastCellNum();i++){
 				//System.out.println(row.getCell(i).getStringCellValue().trim());
 				if(row.getCell(i).getStringCellValue().trim().equals(colName.trim()))
 					col_Num=i;
 			}
 			if(col_Num==-1)
 				return "";
 			
 			sheet = book.getSheetAt(index);
 			row = sheet.getRow(rowNum-1);
 			if(row==null)
 				return "";
 			cell = row.getCell(col_Num);
 			
 			if(cell==null)
 				return "";
 			
 			if(cell.getCellType()==Cell.CELL_TYPE_STRING)
 				  return cell.getStringCellValue();
 			else if(cell.getCellType()==Cell.CELL_TYPE_NUMERIC || cell.getCellType()==Cell.CELL_TYPE_FORMULA ){
 				  
 				  String cellText  = String.valueOf(cell.getNumericCellValue());
 				  if (HSSFDateUtil.isCellDateFormatted(cell)) {
 			           
 					  double d = cell.getNumericCellValue();

 					  Calendar cal =Calendar.getInstance();
 					  cal.setTime(HSSFDateUtil.getJavaDate(d));
 			            cellText =
 			             (String.valueOf(cal.get(Calendar.YEAR))).substring(2);
 			           cellText = cal.get(Calendar.DAY_OF_MONTH) + "/" +
 			                      cal.get(Calendar.MONTH)+1 + "/" + 
 			                      cellText;
 			         }
               return cellText;
 			  }else if(cell.getCellType()==Cell.CELL_TYPE_BLANK)
 			      return ""; 
 			  else 
 				  return String.valueOf(cell.getBooleanCellValue());
 			
 			}
 			catch(Exception e){
 				
 				e.printStackTrace();
 				return "row "+rowNum+" or column "+colName +" does not exist in xls";
 			}
 		}
    
    
    public  Object[][] excelReader(String sheetname)  {

        File file = new File(this.path);
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		 try {
			book = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 sheet = book.getSheet(sheetname);
		
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()] ; //2D ARRAY OF TYPE OBJECT
		
		
		for(int i =0 ; i<sheet.getLastRowNum(); i++) {
			
			for(int j=0; j<sheet.getRow(0).getLastCellNum(); j++) {
				
			data[i][j] = sheet.getRow(i+1).getCell(j).toString();	
			
			System.out.print("       " + data[i][j]);
				
			}
		    System.out.println();
			//System.out.println("  \t");
		}
		
		
	   return data;	
	}

}
