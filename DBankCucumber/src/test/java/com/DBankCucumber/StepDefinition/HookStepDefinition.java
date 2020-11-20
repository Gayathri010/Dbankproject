package com.DBankCucumber.StepDefinition;

import java.io.IOException;

import com.DBankCucumber.Baseclass.Baseclass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HookStepDefinition extends Baseclass{

	
	@Before
	
	public void beforehook(Scenario scenario) {

		System.out.println(scenario.getName());
		System.out.println("started");
	}
	
	@After
	public void Afterhook(Scenario scenario) throws IOException {
    System.out.println("status:"+scenario.getStatus());
    if (scenario.isFailed()) {
		
    String id=	scenario.getId();
    System.out.println("scenario id is:"+id);
    Screenshot(id);
	}
    
    System.out.println("id:"+scenario.getId());
    
	}
	
}
