$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Shamima Nasrin/eclipse-workspace/Cucumber2/src/test/resources/search/LoginDemo2.feature");
formatter.feature({
  "line": 1,
  "name": "Test login functionality",
  "description": "",
  "id": "test-login-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Check login is successful with valid credentials",
  "description": "",
  "id": "test-login-functionality;check-login-is-successful-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "browser is open",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user is on login page",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "clicks on login",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user is navigated to the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDafinationDemo.browser_is_open()"
});
formatter.result({
  "duration": 5974118200,
  "status": "passed"
});
formatter.match({
  "location": "StepDafinationDemo.user_is_on_login_page()"
});
formatter.result({
  "duration": 916120700,
  "status": "passed"
});
formatter.match({
  "location": "StepDafinationDemo.user_enters_username_and_password()"
});
formatter.result({
  "duration": 5149117700,
  "status": "passed"
});
formatter.match({
  "location": "StepDafinationDemo.clicks_on_login()"
});
formatter.result({
  "duration": 142423100,
  "status": "passed"
});
formatter.match({
  "location": "StepDafinationDemo.user_is_navigated_to_the_home_page()"
});
formatter.result({
  "duration": 72200,
  "status": "passed"
});
});