@logintesting
Feature: Validate skyBlueBackground Button
Background: 
	 Given User is on the TechfiosTest page

Scenario: User should be able to click skyBlueButton
	 When I click on the skyBlueButton 
  Then The background color should change to sky blue 