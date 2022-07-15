package com.payroll.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TimeSheetPage {
	WebDriver driver;
	By settings=By.xpath("//a[@href='/payrollapp/user']");
	By user=By.cssSelector(".dropdown-toggle");
	By dashboard=By.name("Dashboard");
	By company=By.name("Company");
	By clients=By.name("Clients");
	By workers=By.name("Workers");
	By deduction=By.name("Deduction");
	By timesheet=By.name("TimeSheet");
	By payslip=By.name("Payslip");
	By invoice=By.name("Invoice");
	By report=By.name("Report");
	By pending=By.partialLinkText("Pending");
	By approved=By.partialLinkText("Approved");
	By create=By.linkText("Create Timesheet"); 
	By genepay=By.cssSelector(".btn.btn-warning.btn-responsive.playslip");
	By geneinv=By.cssSelector(".btn.btn-warning.btn-responsive.invoice");
	By apptime=By.cssSelector(".btn.btn-success.btn-responsive.pull-right");
	By logo=By.xpath("//img[@src='/payrollapp/images/login-logo.png']");
	public TimeSheetPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement timesettings()
	{
		return driver.findElement(settings);
	}
	public WebElement timeuser()
	{
		return driver.findElement(user);
	}
	public WebElement timedashboard()
	{
		return driver.findElement(dashboard);
	}
	public WebElement timecompany()
	{
		return driver.findElement(company);
	}
	public WebElement timeclients()
	{
		return driver.findElement(clients);
	}
	public WebElement timeworkers()
	{
		return driver.findElement(workers);
	}
	public WebElement timededuction()
	{
		return driver.findElement(deduction);
	}
	public WebElement timetimesheet()
	{
		return driver.findElement(timesheet);
	}
	public WebElement timepayslip()
	{
		return driver.findElement(payslip);
	}
	public WebElement timeinvoice()
	{
		return driver.findElement(invoice);
	}
	public WebElement timereports()
	{
		return driver.findElement(report);
	}
	public WebElement timepending()
	{
		return driver.findElement(pending);
	}
	public WebElement timeapproved()
	{
		return driver.findElement(approved);
	}
	public WebElement timecreate()
	{
		return driver.findElement(create);
	}
	public WebElement timegenepay()
	{
		return driver.findElement(genepay);
	}
	public WebElement timegeneinv()
	{
		return driver.findElement(invoice);
	}
	public WebElement timeapprove()
	{
		return driver.findElement(apptime);
	}
	public WebElement timelogo()
	{
		return driver.findElement(logo);
	}



}
