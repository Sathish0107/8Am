@sanity @karthi
Feature: Add TariffPlan Functionality
  I want to use this template for my feature file
  
  Background:
  # Given user should be telecom homepage
   And user should navigate to Addtariffplan page
  

  Scenario: Add TariffPlan details with valid data
   When user should enter plan details
   #And user reset the plan details
   And user should submit the plan details
   #Then user tariff plan details should get reset
    And user should not be displayed with congratulation you add tariffplan
 
  @smoke @karthi @java 
  Scenario: Add TariffPlan details with valid data
    When user should enter plan detailss
      | 100 | 200 | 300 | 400 | 1 | 2 | 3 |
      | 200 | 300 | 400 | 500 | 2 | 3 | 4 |
      | 300 | 400 | 500 | 600 | 3 | 4 | 5 |
      | 400 | 500 | 600 | 700 | 4 | 5 | 6 |
    And user should submit the plan details
    And user should not be displayed with congratulation you add tariffplan

  Scenario: Add TariffPlan details with valid data
    When user should enter plan detail
      | MR  | LM  | IM  | SMS | LMC | IMC | SMC |
      | 100 | 200 | 300 | 400 |   1 |   2 |   3 |
      | 200 | 300 | 400 | 500 |   2 |   3 |   4 |
      | 300 | 400 | 500 | 600 |   3 |   4 |   5 |
      | 400 | 500 | 600 | 700 |   4 |   5 |   6 |
    And user should submit the plan details
    And user should not be displayed with congratulation you add tariffplan
