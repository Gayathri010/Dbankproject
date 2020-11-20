package com.DBankCucumber.StepDefinition;


import com.DBankCucumber.Baseclass.Baseclass;
import com.DBankCucumber.Helper.FileReaderManager;
import com.DBankCucumber.pom.LoginPage;

import cucumber.api.java.en.*;
import junit.framework.Assert;

public class LoginStepDefinition extends Baseclass {

	LoginPage lp =new LoginPage(driver);
	@Given("^To get the url$")
	public void to_get_the_url() throws Throwable {
		
		
		String geturl = FileReaderManager.getinstance().getCRinstance().geturl();
		getUrl(geturl);
	}
	

	@When("^To click the Signup option$")
	public void to_click_the_Signup_option() throws Throwable {
		
		
	    clickOnElement(lp.getSignup());
	}

	@When("^To choose \"([^\"]*)\" as the title$")
	public void to_choose_as_the_title(String arg1) throws Throwable {
	   
		selection(lp.getTitle(), "byValue", "Mrs.");
	}

	@When("^to enter the \"([^\"]*)\" as firstname$")
	public void to_enter_the_as_firstname(String arg1) throws Throwable {
	   
		inputValueElement(lp.getFirstname(), "Gayathri");
	}

	@When("^to enter the \"([^\"]*)\" as lastname$")
	public void to_enter_the_as_lastname(String arg1) throws Throwable {
	   
		inputValueElement(lp.getLastname(), "Murugan");
	}

	@When("^To choose the \"([^\"]*)\" as Gender$")
	public void to_choose_the_as_Gender(String arg1) throws Throwable {
	    clickOnElement(lp.getFemale());
	}

	@When("^To enter \"([^\"]*)\" as dob$")
	public void to_enter_as_dob(String arg1) throws Throwable {
	    
		inputValueElement(lp.getDob(), "05/17/1997");
	}

	@When("^to enter the \"([^\"]*)\" as ssnumber$")
	public void to_enter_the_as_ssnumber(String arg1) throws Throwable {
	    
		inputValueElement(lp.getSsn(), "152-22-1254");
	}

	@When("^To enter the \"([^\"]*)\" as emailid$")
	public void to_enter_the_as_emailid(String arg1) throws Throwable {
	    
		inputValueElement(lp.getEmail(), "gayokg1702@gmail.com");
	}

	@When("^To enter the \"([^\"]*)\" as password$")
	public void to_enter_the_as_password(String arg1) throws Throwable {
	    
		inputValueElement(lp.getPassword(), "Gayumkg0217");
	}

	@When("^to enter the \"([^\"]*)\" as confirmpassword$")
	public void to_enter_the_as_confirmpassword(String arg1) throws Throwable {
		inputValueElement(lp.getConfirmpass(), "Gayumkg0217");
	}

	@Then("^to click next$")
	public void to_click_next() throws Throwable {
   clickOnElement(lp.getNext());
   Assert.assertEquals(true, false);
	    
	}



}
