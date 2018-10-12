package retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryTest implements IRetryAnalyzer {
	
	int count = 0;
	int retryLimit = 3;

	@Override
	public boolean retry(ITestResult result) {
		
		if(count<retryLimit) {  //if count is smaller that retryLimit,increment the count
			
			System.out.println("Retrying Test   " + result.getName()+ "Status   " + result.getStatus());
			count++;
			return true;
			}
		return false;    //Else return false
	}

}
