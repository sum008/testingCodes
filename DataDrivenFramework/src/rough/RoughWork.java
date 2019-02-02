package rough;

import dd_utility.ExcelRead;

public class RoughWork {
	
	static ExcelRead read = new ExcelRead("C:\\Users\\Sumit\\eclipse-workspace\\DataDrivenFramework\\src\\dd_properties\\testdata.xlsx");
	public static boolean isExecutable() {
	
		for(int rownum=2; rownum<=read.getRowCount("sumit"); rownum++) {
			if(read.getCellData("sumit", "tcid", rownum).equals("LoginTest")){
				
				if(read.getCellData("sumit", "runmode", rownum).equals("Y")) {
					
					return true;
				}
			}else {
				
				return false;
			}
			
		}
		return false;
	}

	public static void main(String[] args) {
		
		read.excelReader("sumit");
		//System.out.println(isExecutable());
	}

}
