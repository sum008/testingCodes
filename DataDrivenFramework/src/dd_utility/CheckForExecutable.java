package dd_utility;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import dd_Core.TestCore;

public class CheckForExecutable extends TestCore {
	
	public static boolean isExecutable(String tcid,int rownumber) {
		
		for(int rownum=rownumber; rownum<=reader.getRowCount("sumit"); rownum++) {
			if(reader.getCellData("sumit", "tcid", rownum).equals(tcid)){
				
				if(reader.getCellData("sumit", "runmode", rownum).equals("Y")) {
					
					return true;
				}
			}else {
				
				return false;
			}
			
		}
		return false;
	}
	
	public static void captureScreenshot() {
		
		 Calendar cal = new GregorianCalendar();
		  int month = cal.get(Calendar.MONTH); //4
		  int year = cal.get(Calendar.YEAR); //2013
		  int sec =cal.get(Calendar.SECOND);
		  int min =cal.get(Calendar.MINUTE);
		  int date = cal.get(Calendar.DATE);
		  int day =cal.get(Calendar.HOUR_OF_DAY);
		
		
	
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    try {
	    	String mailscreenshotpath = System.getProperty("user.dir")+"\\screenshots\\"+year+"_"+date+"_"+(month+1)+"_"+day+"_"+min+"_" +sec+".jpeg";
			FileUtils.copyFile(scrFile, new File(mailscreenshotpath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	   
	}

}
