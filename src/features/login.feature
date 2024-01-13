Feature: login functionality



Scenario Outline: Verify login with valid details

Given user launch site
When  enter username "<username>" and password "<password>"
And   click on login button
Then  Validate error message


Examples:
|username|password|
|test234|pass23|
|TEST232|ato@32|
|hellp|world|
|standard_user|secret_sauce|