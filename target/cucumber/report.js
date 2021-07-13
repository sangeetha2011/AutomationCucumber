$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature/WhiteBackground.feature");
formatter.feature({
  "line": 2,
  "name": "Validate skyBlueBackground Button",
  "description": "",
  "id": "validate-skybluebackground-button",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@logintesting1"
    }
  ]
});
formatter.before({
  "duration": 1963879600,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is on the Techfiostest page",
  "keyword": "Given "
});
formatter.match({
  "location": "WhiteBackgroundDef.user_is_on_the_techfiostest_page()"
});
formatter.result({
  "duration": 749866300,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "User should be able to click WhiteButton",
  "description": "",
  "id": "validate-skybluebackground-button;user-should-be-able-to-click-whitebutton",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I click on the WhiteButton",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "The background color should change to White",
  "keyword": "Then "
});
formatter.match({
  "location": "WhiteBackgroundDef.when_I_click_on_the_skyBlueButton()"
});
formatter.result({
  "duration": 49521300,
  "status": "passed"
});
formatter.match({
  "location": "WhiteBackgroundDef.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "duration": 25312900,
  "status": "passed"
});
formatter.after({
  "duration": 1125068500,
  "status": "passed"
});
});