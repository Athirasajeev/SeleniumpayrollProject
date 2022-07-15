package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.payroll.BaseClass.BaseClass;
import com.payroll.PageObjects.HomePage;
import com.payroll.PageObjects.LoginPage;
import com.payroll.Utilities.ExcelRead;

public class HomeTest extends BaseClass{
	@BeforeMethod
	public void firstCall() {
		launchApp();
	}

	/*
	 * @AfterTest public void aftertests() { driver.close(); }
	 */
@Test
public void timesheetclick() throws IOException 
{
	LoginPage lp=new LoginPage(driver);
	String s = ExcelRead.readStringData(1, 1);
	String s2=ExcelRead.readStringData(1, 2);
	lp.loginfun(s,s2);
	HomePage hp=new HomePage(driver);
	hp.timesheetmeth().click();
	
}
}
