package TestCases;
//import java.time.Duration;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.payroll.Actions.Action;
import com.payroll.BaseClass.BaseClass;
import com.payroll.PageObjects.HomePage;
import com.payroll.PageObjects.LoginPage;
import com.payroll.Utilities.ExcelRead;

public class LoginTest extends BaseClass {
	@BeforeMethod
	public void firstCall() {
		launchApp();
	}
	
	LoginPage lg;
	Action act;
	HomePage hp;
@BeforeClass
public void object()
{
	lg=new LoginPage(driver);
	hp=new HomePage(driver);
	act =new Action();
	
}

// Login with valid credentials

	@Test
	public void Login() throws InterruptedException, IOException {
		String s = ExcelRead.readStringData(1, 1);
		String s2=ExcelRead.readStringData(1, 2);
		lg.loginfun(s,s2);
		String Expected = "http://www.qabible.in/payrollapp/site/index";
		Thread.sleep(3000);
		String actual = driver.getCurrentUrl();
		Assert.assertEquals(actual, Expected);
		
	}

	// Verify there is an alert message is displayed while entering invalid credentials

	@Test
	public void invalidlogin() throws InterruptedException {
	

		lg.uname().click();
		lg.uname().sendKeys("carol123");
		lg.pswd().click();
		lg.pswd().sendKeys("123");
		lg.loginbtnmeth().click();
		Thread.sleep(5000);

		String Expected = "Incorrect username or password.";
		String actual = driver.findElement(By.xpath("(//div/p[@class='help-block help-block-error'])[2]")).getText();
		Assert.assertEquals(actual, Expected);

	}

	// Verify there is an alert message is displayed while entering invalid username

	@Test
	public void invalidlogin2() throws InterruptedException {
		lg.uname().click();
		lg.uname().sendKeys("carol123");
		lg.pswd().click();
		lg.pswd().sendKeys("1q2w3e4r");
		lg.loginbtnmeth().click();
		Thread.sleep(5000);
		String Expected = "Incorrect username or password.";		String actual = driver.findElement(By.xpath("(//div/p[@class='help-block help-block-error'])[2]")).getText();
		Assert.assertEquals(actual, Expected);
	}

	// Verify there is an alert message is displayed while entering invalid password

	@Test
	public void invalidlogin3() throws InterruptedException {
		lg.uname().click();
		lg.uname().sendKeys("carol");
		lg.pswd().click();
		lg.pswd().sendKeys("123");
		lg.loginbtnmeth().click();
		Thread.sleep(5000);
		String Expected = "Incorrect username or password.";
		String actual = driver.findElement(By.xpath("(//div/p[@class='help-block help-block-error'])[2]")).getText();
		Assert.assertEquals(actual, Expected);
		
	}

	// Verify whether there is an alert message when user login with blank username
	// and password

	@Test
	public void invalidloginblank() throws InterruptedException {
		lg.loginbtnmeth().click();
		Thread.sleep(5000);
		String Expected1 = "Username cannot be blank.";
		String actual1 = driver.findElement(By.xpath("(//div/p[@class='help-block help-block-error'])[1]")).getText();
		Assert.assertEquals(actual1, Expected1);
	String Expected2 = "Password cannot be blank.";
		String actual2 = driver.findElement(By.xpath("(//div/p[@class='help-block help-block-error'])[2]")).getText();
		Assert.assertEquals(actual2, Expected2);
	
	}

	// Verify whether there is an alert message when user login with blank username

	@Test
	public void invalidloginblankuser() throws InterruptedException {
		lg.pswd().click();
		lg.pswd().sendKeys("1q2w3e4r");
		lg.loginbtnmeth().click();
		Thread.sleep(5000);
		String Expected1 = "Username cannot be blank.";
		String actual1 = driver.findElement(By.xpath("(//div/p[@class='help-block help-block-error'])[1]")).getText();
		Assert.assertEquals(actual1, Expected1);

	}

	// Verify whether there is an alert message when user login with blank password

	@Test
	public void invalidloginblankpass() throws InterruptedException {
		lg.uname().click();
		lg.uname().sendKeys("carol");
		lg.loginbtnmeth().click();
		Thread.sleep(5000);
		String Expected1 = "Password cannot be blank.";
		String actual1 = driver.findElement(By.xpath("(//div/p[@class='help-block help-block-error'])[2]")).getText();
		Assert.assertEquals(actual1, Expected1);
		

	}

	//Verify the user can click on reset it link

	@Test
	public void resetlink() throws InterruptedException {
		lg.resetmeth().click();
		Boolean Expected = true;
		Thread.sleep(3000);
		Boolean actual = driver.findElement(By.xpath("//img[@src='/payrollapp/images/login-logo.png']")).isDisplayed();
		Assert.assertEquals(actual, Expected);
		
	}
	
	@AfterTest
	public void aftertests()
	{
	driver.close();
	}
}
