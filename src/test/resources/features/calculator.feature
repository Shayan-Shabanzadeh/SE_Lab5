@tag
Feature: Calculator

  Scenario: add two numbers
    Given Two input values, 1 and 2
    When I add the two values
    Then I expect the result 3

  Scenario Outline: add two numbers
    Given Two input values, <first> and <second>
    When I add the two values
    Then I expect the result <result>

    Examples:
      | first | second | result |
      | 1     | 12     | 13     |
      | -1    | 6      | 5      |
      | 2     | 2      | 4      |

  Scenario Outline: Calculate the square root of (a / b)
    Given Two input values, <a> and <b> for sqrt
    When I calculate the square root of (a / b)
    Then I expect the result for square <result>

    Examples:
      | a  | b | result |
      | 4  | 1 | 2      |
      | 36 | 4 | 3      |
      | 81 | 9 | 3      |
t