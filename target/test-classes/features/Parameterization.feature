Feature: Giftrete Community

  Scenario Outline: Create Community with invalid details
    Given I launch giftrete website
      And I click on community
      And I click on create community
      And I enter first name"<FirstName>"
      And I enter Last name"<LastName>"
      And I enter email address"<Email>"
      And I enter phone number
      And I enter password "<password>"
      And I confirm password "<ConfirmedPassword>"
  #   And I click the CAPTCHA Box
  #   And I choose matching images as desplayed
    When I click on sign-up/create community button
    And I confirm an Error message "image file name cannot be empty! please select a valid image file"
   # Then I quit the browser


    Examples:
      | FirstName | LastName | Email               | Password   | ConfirmedPassword |
      | Tombari   | Ganago   | tomneco92@yahoo.com | mypassword | mypass            |
      | Tombari   | Ga       | tomneco92@yahoo.com | mypassword | mypassword        |
      | Tombari   | Ganago   | tomnec.com          | mypassword | mypassword        |
      | Tomba     | Ganago   | tomneco92@yahoo.com | mypassword | mypassword        |



#Scenario: Create Community with valid details
#    Given I launch giftrete website
#    And I click on community
#    And I click on create community
#    And I enter first name"Tombari"
#    And I enter Last name"Ganago"
#    And I enter email address"tomneco92@yahoo.com"
#    And I enter password "mypassword"
#    And I confirm password "mypassword"
##    When I click the CAPTCHA Box
##      And I choose matching images as desplayed
#    Then I click on sign-up/create community button


#  Scenario: CREATE COMMUNITY
#    Given I launch giftrete website
#      And I click on community
#      And I enter community name
#    When I click on public
#      And I select education from the category drop-down menu
#      And I enter Location address
#      And I enter community website
#    Then I click on Browse to upload image




