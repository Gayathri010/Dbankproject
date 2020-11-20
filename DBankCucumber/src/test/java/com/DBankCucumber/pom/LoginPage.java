package com.DBankCucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	public static WebDriver driver;
	@FindBy(xpath="//a[text()=' Sign Up Here']")
	private WebElement signup;
	
	@FindBy(xpath="//select[@id='title']")
	private WebElement title;
	
	
	@FindBy(xpath="//input[@id='firstName']")
	private WebElement firstname;

	@FindBy(xpath="//input[@id='lastName']")
	private WebElement lastname;

	@FindBy(xpath="//input[@value='F']")
	private WebElement female;

	
	@FindBy(xpath="//input[@id='dob']")
	private WebElement dob;

	
	@FindBy(xpath="//input[@id='ssn']")
	private WebElement ssn;

	
	@FindBy(xpath="//input[@id='emailAddress']")
	private WebElement email;

	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;

	@FindBy(xpath="//input[@id='confirmPassword']")
	private WebElement confirmpass;
	
	@FindBy(xpath="//button[text()='Next']")
	private WebElement Next;
	
	public LoginPage(WebDriver ldriver) {

		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSignup() {
		return signup;
	}

	public WebElement getTitle() {
		return title;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getFemale() {
		return female;
	}

	public WebElement getDob() {
		return dob;
	}

	public WebElement getSsn() {
		return ssn;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmpass() {
		return confirmpass;
	}

	public WebElement getNext() {
		return Next;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
