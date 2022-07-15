package com.payroll.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateDetails {
	WebDriver driver;
	By branch=By.id("timesheet-branch_id");
	By client=By.id("select2-timesheet-client_id-container");
	By worker=By.id("select2-timesheet-worker_id-container");
	By division=By.id("timesheet-division_id");
	By weekenddate=By.id("timesheet-date");
	By emptype=By.id("timesheet-employment_type");
	By description=By.id("timesheet-description");
	By category=By.id("timesheet-category");
	By ponumber=By.id("timesheet-po_number");
	By timesheetnumber=By.id("timesheet-timesheet_number");
	By directclient=By.id("timesheet-direct_client");
	By ratedescription=By.id("rate-0-type_id");
	By freaquency=By.id("rate-0-frequency");
	By units=By.id("rate-0-units");
	By pay=By.id("rate-0-pay");
	By bill=By.id("rate-0-bill");
	By wtr=By.id("rate-0-wtr");
	By awr=By.id("rate-0-awr");
	By pension=By.id("rate-0-pension");
	By addrate=By.cssSelector(".pull-right.add-item.btn.btn-success.btn-xs");
	By closerate=By.cssSelector(".fa.fa-close");
	By addexpence=By.xpath("(//div/button)[5]");
	By adhoc=By.id("expense-0-type_id");
	By exunits=By.id("expense-0-units");
	By epay=By.id("expense-0-pay");
	By ebill=By.id("expense-0-bill");
	By adddeduction=By.xpath("(//div/button)[7]");
	By dedtype=By.id("deduction-0-type");
	By dedamount=By.id("deduction-0-amount");
	By savebtn=By.xpath("//button[@css='5']");
	
	public CreateDetails(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public WebElement branchmeth()
	{
		return driver.findElement(branch);
	}
	public WebElement clientmeth()
	{
		return driver.findElement(client);
	}
	public WebElement workermeth()
	{
		return driver.findElement(worker);
	}
	public WebElement divisionmeth()
	{
		return driver.findElement(division);
	}
	public WebElement weekenddatetmeth()
	{
		return driver.findElement(weekenddate);
	}
	public WebElement emptypemeth()
	{
		return driver.findElement(worker);
	}
	public WebElement descriptionmeth()
	{
		return driver.findElement(description);
	}
	public WebElement categorymeth()
	{
		return driver.findElement(category);
	}
	public WebElement ponumbermeth()
	{
		return driver.findElement(ponumber);
	}
	public WebElement timesheetnumbermeth()
	{
		return driver.findElement(timesheetnumber);
	}
	public WebElement directclientmeth()
	{
		return driver.findElement(directclient);
	}
	public WebElement ratedescriptionmeth()
	{
		return driver.findElement(ratedescription);
	}
	public WebElement freaquencymeth()
	{
		return driver.findElement(freaquency);
	}
	public WebElement unitsmeth()
	{
		return driver.findElement(units);
	}
	public WebElement paymeth()
	{
		return driver.findElement(pay);
	}
	public WebElement billmeth()
	{
		return driver.findElement(bill);
	}
	public WebElement wtrmeth()
	{
		return driver.findElement(wtr);
	}
	public WebElement awrmeth()
	{
		return driver.findElement(awr);
	}
	public WebElement pensionmeth()
	{
		return driver.findElement(pension);
	}
	public WebElement addratemeth()
	{
		return driver.findElement(addrate);
	}
	public WebElement closeratemeth()
	{
		return driver.findElement(closerate);
	}
	public WebElement addexpencemeth()
	{
		return driver.findElement(addexpence);
	}
	public WebElement adhocmeth()
	{
		return driver.findElement(adhoc);
	}
	public WebElement exunitsmeth()
	{
		return driver.findElement(exunits);
	}
	public WebElement epaymeth()
	{
		return driver.findElement(epay);
	}
	public WebElement ebillmeth()
	{
		return driver.findElement(ebill);
	}
	public WebElement adddeductionemeth()
	{
		return driver.findElement(adddeduction);
	}
	public WebElement dedtypemeth()
	{
		return driver.findElement(dedtype);
	}
	public WebElement dedamountmeth()
	{
		return driver.findElement(dedamount);
	}
	public WebElement savebtnmeth()
	{
		return driver.findElement(savebtn);
	}


}
