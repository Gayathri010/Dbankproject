Feature: Overall Functionality of dbank applications



   
Scenario: enter details using credentials
    Given  To get the url
    When To click the Signup option
    And To choose "Mrs" as the title
    And to enter the "Gayathri" as firstname
    And to enter the "murugan" as lastname
    And To choose the "Female" as Gender
    And To enter "05/17/1997" as dob
    And to enter the "123-45-7898" as ssnumber
    And  To enter the "gayumkg1702@gmail.com" as emailid
    And To enter the "gayumkg0217" as password
    And to enter the "gayumkg0217" as confirmpassword
    Then to click next

Scenario: enter details to register
    Given To enter the "111a" as address
    When to enter the "Chennai" as locality
    And  to enter the "TN" as region
    And to enter the "600018" as Postal 
    And to enter the "India" as country
    And to enter the "(525)-89-4587" as Home
    And to enter the "(525)-89-4587" as mobile
    And to enter the "(525)-89-4587" as work
    And to click Agree
    Then To click the register 

     