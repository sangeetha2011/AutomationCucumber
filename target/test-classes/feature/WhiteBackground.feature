@logintesting1
Feature: Validate skyBlueBackground Button
Background: 
	 Given User is on the Techfiostest page

Scenario: User should be able to click WhiteButton
	 When I click on the WhiteButton 
  Then The background color should change to White 