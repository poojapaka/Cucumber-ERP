@tag
Feature: 
  As admin user want to validate Add Employee with multiple data

  @addEmp
  Scenario Outline: validate add Employee
    Given User Navigate Url "http://orangehrm.qedgetech.com/" in a browser
    When user Enter "Admin" in Username
    And user Enter "Qedge123!@#" in password
    And user clicks Loginbutton
    And user clicks pim
    And user clicks Add button
    And user Enter "<Firstname>" in Firstname
    And user Enter "<middlename>" in middlename
    And user Enter "<Lastname>" in Lastname
    And user Capture EID BeforeAdding emp
    And user click save button
    And user Capture Eid AfterAdding Employee
    Then user validates Eid
    Then user close Browser

    Examples: 
      | Firstname | middlename | Lastname     |
      | pujitha   | Qedge      | Technologies |
      | pujitha   | Qedge      | Technologies |
      | pujitha   | Qedge      | Technologies |
      | pujitha   | Qedge      | Technologies |
      | pujitha   | Qedge      | Technologies |
      | pujitha   | Qedge      | Technologies |
     
