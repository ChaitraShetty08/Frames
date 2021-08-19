package reporting_tool;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Demo1 
{

	@Test
	public void test1()
	{
		ExtentReports report=new ExtentReports("./Reports/r1.html", false);

		ExtentTest test=report.startTest("tc1");

		test.log(LogStatus.PASS, "Pass");
		test.log(LogStatus.FAIL, "Fail");
		test.log(LogStatus.SKIP, "Skip");

		report.endTest(test);

		report.flush();
	}
}
