package com.payroll.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateBrowse {
	WebDriver driver;
	By filetextbox=By.cssSelector("file-caption-name");
	By browsebtn=By.id("file-logo");
	By savebtn=By.cssSelector(".btn.btn-success");
	public CreateBrowse(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement filebox()
	{
		return driver.findElement(filetextbox);
	}
	public WebElement browse()
	{
		return driver.findElement(browsebtn);
	}
	public WebElement savefile()
	{
		return driver.findElement(savebtn);
	}
}
