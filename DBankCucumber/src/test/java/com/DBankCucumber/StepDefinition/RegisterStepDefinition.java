package com.DBankCucumber.StepDefinition;

import com.DBankCucumber.Baseclass.Baseclass;
import com.DBankCucumber.pom.Register;

import cucumber.api.java.en.*;

public class RegisterStepDefinition extends Baseclass {
Register r = new Register(driver);
	
	@Given("^To enter the \"([^\"]*)\" as address$")
	public void to_enter_the_as_address(String arg1) throws Throwable {
	    inputValueElement(r.getAddress(), "111a kam");
	}

	@When("^to enter the \"([^\"]*)\" as locality$")
	public void to_enter_the_as_locality(String arg1) throws Throwable {
		inputValueElement(r.getLocality(), "chennai");
	}

	@When("^to enter the \"([^\"]*)\" as region$")
	public void to_enter_the_as_region(String arg1) throws Throwable {
		inputValueElement(r.getRegion(), "TN");
	}

	@When("^to enter the \"([^\"]*)\" as Postal$")
	public void to_enter_the_as_Postal(String arg1) throws Throwable {
	    
		inputValueElement(r.getPost(), "600018");
	}

	@When("^to enter the \"([^\"]*)\" as country$")
	public void to_enter_the_as_country(String arg1) throws Throwable {
	    
		inputValueElement(r.getCountry(), "India");
	}

	@When("^to enter the \"([^\"]*)\" as Home$")
	public void to_enter_the_as_Home(String arg1) throws Throwable {
	    
		inputValueElement(r.getHome(), "(563)-98-5478");
	}

	@When("^to enter the \"([^\"]*)\" as mobile$")
	public void to_enter_the_as_mobile(String arg1) throws Throwable {
		inputValueElement(r.getMobile(), "(587)-98-5478");
	}

	@When("^to enter the \"([^\"]*)\" as work$")
	public void to_enter_the_as_work(String arg1) throws Throwable {
		inputValueElement(r.getWork(), "(598)-98-5478");
	}

	@When("^to click Agree$")
	public void to_click_Agree() throws Throwable {
		clickOnElement(r.getAgree());
	}
	

	@Then("^To click the register$")
	public void to_click_the_register() throws Throwable {
	    clickOnElement(r.getSumit());
	}


}
