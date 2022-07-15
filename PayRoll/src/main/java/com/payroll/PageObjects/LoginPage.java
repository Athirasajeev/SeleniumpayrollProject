package com.payroll.PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.payroll.Actions.Action;
import com.payroll.BaseClass.BaseClass;
//import com.payroll.Actions.*;
public class LoginPage extends BaseClass{
	WebDriver driver;
	@FindBy(id="loginform-username")
	WebElement username;
	
	@FindBy(id="loginform-password")
	WebElement password;
	
	@FindBy(id="loginform-rememberme")
	WebElement rememberme;
	
	@FindBy(linkText="reset it")
	WebElement reset;
	
	@FindBy(xpath="//button[@name='login-button']")
	WebElement loginbtn;
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public WebElement uname()
	{
		return username;
	}
	public WebElement pswd()
	{
		return password;
	}
	public WebElement remembermeth()
	{
		return rememberme;
	}
	public WebElement resetmeth()
	{
		return reset;
	}
	public WebElement loginbtnmeth()
	{
		return loginbtn;
	}
	public HomePage loginfun(String user,String pass)
	{
		Action act=new Action();
		act.type(username, user);
		act.type(password, pass);
		act.click(driver, loginbtn);
		return new HomePage(driver);
	}
	/*
	 * public String errormsg() { Action act=new Action(); String
	 * msg=errormsg.getText(); return msg; }
	 */

}
