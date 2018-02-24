Feature: Life of king

In order to go office
As a working guy
I want to wish people

@tester
Scenario Outline: I am an Employee and his attitude

Given we work in "<weekday>"
When we meet "<guy>"
Then I skipGreeting him

Examples:
 |weekday |   guy     |
 |tenpm   | watchmen  |
 |ninepm  |  cabdriver|

