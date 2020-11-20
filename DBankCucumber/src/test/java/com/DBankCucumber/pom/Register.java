package com.DBankCucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {

public static WebDriver driver;
	
	@FindBy(xpath="//input[@id='address']")
	WebElement address;
	
	@FindBy(xpath="//input[@id='locality']")
	WebElement locality;
	
	@FindBy(xpath="//input[@id='region']")
	WebElement region;
	
	@FindBy(xpath="//input[@id='postalCode']")
	WebElement post;
	
	@FindBy(xpath="//input[@id='country']")
	WebElement country;
	
	@FindBy(xpath="//input[@id='homePhone']")
	WebElement home;
	
	@FindBy(xpath="//input[@id='mobilePhone']")
	WebElement mobile;
	
	@FindBy(xpath="//input[@id='workPhone']")
	WebElement work;
	
	@FindBy(xpath="//input[@id='agree-terms']")
	WebElement agree;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement sumit;
	
	public Register(WebDriver mdriver) {
		this.driver=mdriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getLocality() {
		return locality;
	}

	public WebElement getRegion() {
		return region;
	}

	public WebElement getPost() {
		return post;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getHome() {
		return home;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getWork() {
		return work;
	}

	public WebElement getAgree() {
		return agree;
	}

	public WebElement getSumit() {
		return sumit;
	}
	
	

	

}
















