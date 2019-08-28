@regression @sanity
Feature: Add Customer functionality
  I want to use this template for my feature file

Background:
   # Given user should be in telecom home page
    And user click on add customer button

@smoke @cucumber
  Scenario: add customer with valid data
    When user enters all the fields
    And user click on submit button
    Then user should be displayed the customer id is generated

@karthi @cucumber
  Scenario: add customer with One Dimensional list
    When user enters all the fields.
      | ajith | rajan | ramav@gmail.com | chennai | 12344556667 |
    And user click on submit button
    Then user should be displayed the customer id is generated

@smoke  @java @karthi
  Scenario: add customer with One Dimensional list
   # Given user should be in telecom home page
    When user enters all the field
      | fname   | soundar           |
      | lname   | rajan             |
      | email   | soundar@gmail.com |
      | address | coimbatore        |
      | phno    |         123456677 |
   And user click on submit button
    Then user should be displayed the customer id is generated

@karthi
  Scenario Outline: 
   # Given user should be in telecom home page
    When user enters all the fields"<fname>","<lname>","<email>","<address>","<phno>"
    And user click on submit button
   Then user should be displayed the customer id is generated

    Examples: 
      | fname    | lname | email           | address | phno        |
      | java     | rajan | ramav@gmail.com | chennai | 12344556667 |
      | selenium | rajan | ramav@gmail.com | chennai | 12344556667 |
      | cucumber | rajan | ramav@gmail.com | chennai | 12344556667 |
      | testng   | rajan | ramav@gmail.com | chennai | 12344556667 |
      | junit    | rajan | ramav@gmail.com | chennai | 12344556667 |
      
      
