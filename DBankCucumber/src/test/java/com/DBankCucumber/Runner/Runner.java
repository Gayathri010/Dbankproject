package com.DBankCucumber.Runner;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.DBankCucumber.Baseclass.Baseclass;
import com.DBankCucumber.Helper.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\java\\com\\DBankCucumber\\Feature",
                  glue = "com.DBankCucumber.StepDefinition",
                  plugin = {"pretty","html:Report\\CucumberReport","json:Report\\Cucumber.json",
                            "com.cucumber.listener.ExtentCucumberFormatter:Reports/Extend_Report.html",
                            "rerun:report2/FailedScenario.text"},
                  monochrome=true)
                                                                            







public class Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setup() throws IOException {
     String getbrowsename = FileReaderManager.getinstance().getCRinstance().getbrowsename();		
		driver=Baseclass.Browser(getbrowsename);
	}
	

}
