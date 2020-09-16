Feature: My Selenium Commands
  Scenario: Getting Commands in Selenium
    Given I navigate to Blueskycitadelform website
      And I refresh the home page
      And I get the url title
      And I get the page url itself
      And I get the page source
      And I get the window handle
    When I click on automation Testing Form
      And I get the form page Title
      And I get the attribute of an Element
      And I type the Password
      And I clear the password
      And I navigate back to the Previous page
      And I navigate to the next Page using the forward button
      And I click on the Submit button
      And the password error Message is displayed
    Then I close my Window