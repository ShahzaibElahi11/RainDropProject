Feature: Raindrops functionality Test Cases

  @Raindrops @HomePage
  Scenario: Verify to Home Page
    Given launch the environment
    When  user click on about page
    Then user click on home page
    And user is landing successfully and home page is displayed

  @AboutPage
  Scenario: Verify to About Page
    Given launch the environment
    When user click on about page
    Then user is landing successfully and about page is displayed


  @PlanPage
  Scenario: Verify to Care Life Plan
    Given launch the environment
    When user click on plan page
    Then user answer the following question with yes
    And user is landing successfully and plan page is displayed
    And user buy now care life plan
    And user insert payment details
    And user click on submit button
    And user can verify the submission

  @PlanPage
  Scenario: Verify to Good Health Plan
    Given launch the environment
    When user click on plan page
    Then user answer the following question with no
    And user is landing successfully and plan page is displayed
    And user buy now good health plan
    And user insert payment details
    And user click on submit button
    And user can verify the submission

  @PlanPage
  Scenario: Verify to Health Plan for Above 30 Years Diabetes Patient
    Given launch the environment
    When user click on plan page
    Then user create plan for above thirty years and diabetes patient
    And user is landing successfully and plan page is displayed
    And user buy now good health plan
    And user insert payment details
    And user click on submit button
    And user can verify the submission


  @PlanPage
  Scenario: Verify to Health Plan for Under 30 Years Smoker and Alcohol Drinker
    Given launch the environment
    When user click on plan page
    Then user create plan for under thirty years smoker and drinker
    And user is landing successfully and plan page is displayed
    And user buy now good health plan
    And user insert payment details
    And user click on submit button
    And user can verify the submission

  @PlanPage
  Scenario: Verify to Care Life Plan Above 30 Years Lazy Person
    Given launch the environment
    When user click on plan page
    Then user create plan for above thirty years lazy person
    And user is landing successfully and plan page is displayed
    And user buy now care life plan
    And user insert payment details
    And user click on submit button
    And user can verify the submission