package TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.payroll.BaseClass.BaseClass;
import com.payroll.PageObjects.TimeSheetPage;

public class TimesheetTest extends BaseClass{
	@BeforeTest
	public void firstCall() {
		launchApp();
	}
	
	//Verify the user can Approve the pending time sheets
	@Test
	public void clickPending() throws InterruptedException 
	{
		TimeSheetPage tp=new TimeSheetPage(driver);
		tp.timetimesheet().click();
		tp.timeapprove().click(); 
		Boolean Expected = true;
		Thread.sleep(3000);
		Boolean actual = driver.findElement(By.xpath("//img[@src='/payrollapp/images/login-logo.png']")).isDisplayed();
		Assert.assertEquals(actual, Expected);
		
	}
	//Verify the user can create new timesheet
@Test
public void createtimesheet()
{
	
}

}