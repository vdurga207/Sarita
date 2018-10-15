Feature: Orange hrm
@tag1
Scenario Outline: login to orange
Given openorge hrm
When Enter username and password<"un","pwd">
Then Click on logout

Examples:
|un|pwd|
|qaplanet1|lab1|


@front
Scenario: frontaccout
Given url
