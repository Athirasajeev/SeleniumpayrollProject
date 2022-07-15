package com.payroll.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

import com.payroll.Actions.Action;

public class HomePage {
	WebDriver driver;
	@FindBy(css=".col-sm-6.page-title")
	WebElement pagetext;
	@FindBy(xpath="//a[@href='/payrollapp/timesheet/index']")
	WebElement timesheettab;
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public WebElement pagetextmeth()
	{
		return pagetext;
	}
	public WebElement timesheetmeth()
	{
		return timesheettab;
	}
	/*
	 * public TimeSheetPage timetab() { Action act=new Action(); act.click(driver,
	 * timesheettab); return new TimeSheetPage(driver); }
	 */ 

}
