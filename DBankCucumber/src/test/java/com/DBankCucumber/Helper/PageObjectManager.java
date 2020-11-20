package com.DBankCucumber.Helper;

import org.openqa.selenium.WebDriver;

import com.DBankCucumber.pom.LoginPage;
import com.DBankCucumber.pom.Register;

public class PageObjectManager {
public static WebDriver driver;
	private LoginPage lp;
	private Register r;
	
	
	public PageObjectManager(WebDriver kdriver) {
		this.driver=kdriver;
	}
	
	public LoginPage getLp() {
		 lp = new LoginPage(driver);
		return lp;
	}
	
	public Register getR() {
	  r = new Register(driver);
		return r;
	}
}
