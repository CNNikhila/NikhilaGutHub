Feature: login functionality of sales force

  @sc01 @smoketest
   Scenario Outline: login validation with valid credi
    Given user navigate to login page of sales force application
    When user enter username "<UserName>" and password "<paaaword>"
    And user clicks the login button
    Then  verify whether the user navigates to the homepage
    Examples:
      | UserName | Password |  |
      | lmit     | abc      |  |
      | hello    | xyz      |  |

    @sco2 @smoketest
      Scenario: login validation with invalid credi
      Given user navigate to login page of sales force application
      When user enter username "learmore" and password "123"
      And user clicks the login button
      Then  user verify the error message
      
