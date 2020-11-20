$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("dbank.feature");
formatter.feature({
  "line": 1,
  "name": "Overall Functionality of dbank applications",
  "description": "",
  "id": "overall-functionality-of-dbank-applications",
  "keyword": "Feature"
});
formatter.before({
  "duration": 592029,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "enter details using credentials",
  "description": "",
  "id": "overall-functionality-of-dbank-applications;enter-details-using-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "To get the url",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "To click the Signup option",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "To choose \"Mrs\" as the title",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "to enter the \"Gayathri\" as firstname",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "to enter the \"murugan\" as lastname",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "To choose the \"Female\" as Gender",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "To enter \"05/17/1997\" as dob",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "to enter the \"123-45-7898\" as ssnumber",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "To enter the \"gayumkg1702@gmail.com\" as emailid",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "To enter the \"gayumkg0217\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "to enter the \"gayumkg0217\" as confirmpassword",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "to click next",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.to_get_the_url()"
});
formatter.result({
  "duration": 19986350209,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.to_click_the_Signup_option()"
});
formatter.result({
  "duration": 20137167386,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mrs",
      "offset": 11
    }
  ],
  "location": "LoginStepDefinition.to_choose_as_the_title(String)"
});
formatter.result({
  "duration": 949567432,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Gayathri",
      "offset": 14
    }
  ],
  "location": "LoginStepDefinition.to_enter_the_as_firstname(String)"
});
formatter.result({
  "duration": 3551193016,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "murugan",
      "offset": 14
    }
  ],
  "location": "LoginStepDefinition.to_enter_the_as_lastname(String)"
});
formatter.result({
  "duration": 3423243368,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Female",
      "offset": 15
    }
  ],
  "location": "LoginStepDefinition.to_choose_the_as_Gender(String)"
});
formatter.result({
  "duration": 5399524417,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "05/17/1997",
      "offset": 10
    }
  ],
  "location": "LoginStepDefinition.to_enter_as_dob(String)"
});
formatter.result({
  "duration": 3802801617,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123-45-7898",
      "offset": 14
    }
  ],
  "location": "LoginStepDefinition.to_enter_the_as_ssnumber(String)"
});
formatter.result({
  "duration": 3488548507,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "gayumkg1702@gmail.com",
      "offset": 14
    }
  ],
  "location": "LoginStepDefinition.to_enter_the_as_emailid(String)"
});
formatter.result({
  "duration": 3573825879,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "gayumkg0217",
      "offset": 14
    }
  ],
  "location": "LoginStepDefinition.to_enter_the_as_password(String)"
});
formatter.result({
  "duration": 3542507590,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "gayumkg0217",
      "offset": 14
    }
  ],
  "location": "LoginStepDefinition.to_enter_the_as_confirmpassword(String)"
});
formatter.result({
  "duration": 3373941206,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.to_click_next()"
});
formatter.result({
  "duration": 30251034768,
  "error_message": "junit.framework.AssertionFailedError: expected:\u003ctrue\u003e but was:\u003cfalse\u003e\r\n\tat junit.framework.Assert.fail(Assert.java:57)\r\n\tat junit.framework.Assert.failNotEquals(Assert.java:329)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:78)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:174)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:181)\r\n\tat com.DBankCucumber.StepDefinition.LoginStepDefinition.to_click_next(LoginStepDefinition.java:85)\r\n\tat ✽.Then to click next(dbank.feature:18)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1020535336,
  "status": "passed"
});
formatter.before({
  "duration": 256126,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "enter details to register",
  "description": "",
  "id": "overall-functionality-of-dbank-applications;enter-details-to-register",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "To enter the \"111a\" as address",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "to enter the \"Chennai\" as locality",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "to enter the \"TN\" as region",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "to enter the \"600018\" as Postal",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "to enter the \"India\" as country",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "to enter the \"(525)-89-4587\" as Home",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "to enter the \"(525)-89-4587\" as mobile",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "to enter the \"(525)-89-4587\" as work",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "to click Agree",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "To click the register",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "111a",
      "offset": 14
    }
  ],
  "location": "RegisterStepDefinition.to_enter_the_as_address(String)"
});
formatter.result({
  "duration": 3555302228,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Chennai",
      "offset": 14
    }
  ],
  "location": "RegisterStepDefinition.to_enter_the_as_locality(String)"
});
formatter.result({
  "duration": 3343671681,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TN",
      "offset": 14
    }
  ],
  "location": "RegisterStepDefinition.to_enter_the_as_region(String)"
});
formatter.result({
  "duration": 3322496730,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "600018",
      "offset": 14
    }
  ],
  "location": "RegisterStepDefinition.to_enter_the_as_Postal(String)"
});
formatter.result({
  "duration": 3352716802,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "India",
      "offset": 14
    }
  ],
  "location": "RegisterStepDefinition.to_enter_the_as_country(String)"
});
formatter.result({
  "duration": 3343283526,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "(525)-89-4587",
      "offset": 14
    }
  ],
  "location": "RegisterStepDefinition.to_enter_the_as_Home(String)"
});
formatter.result({
  "duration": 3439821113,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "(525)-89-4587",
      "offset": 14
    }
  ],
  "location": "RegisterStepDefinition.to_enter_the_as_mobile(String)"
});
formatter.result({
  "duration": 3471263966,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "(525)-89-4587",
      "offset": 14
    }
  ],
  "location": "RegisterStepDefinition.to_enter_the_as_work(String)"
});
formatter.result({
  "duration": 3394166298,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefinition.to_click_Agree()"
});
formatter.result({
  "duration": 5421176631,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStepDefinition.to_click_the_register()"
});
formatter.result({
  "duration": 18692271805,
  "status": "passed"
});
formatter.after({
  "duration": 298114,
  "status": "passed"
});
});