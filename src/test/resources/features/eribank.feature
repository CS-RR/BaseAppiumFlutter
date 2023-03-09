
Feature: App Eribank
  I as a user want to log in to see my balance

@scenario1
  Scenario: Login to the Eribank application
    Given Laura login with username and password
      | username | password |
      | company  | company  |
    When you can see your balance
  Then you can make payment

