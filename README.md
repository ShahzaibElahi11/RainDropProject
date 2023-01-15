**UI Testing Framework**

Our framework is built for automating UI testing utilizing Selenium, Cucumber, Extent Report, and Maven for managing dependencies. It employs a Page Object Model and Page Factory approach, and allows for selective execution of tests by specifying tags associated with scenarios and feature files via the test runner file.

**Technology Stack**
* Selenium
* Cucumber
* TestNG
* Extent Report
* Java
* Maven

**Prerequisites**

* Java 1.8 - Java Dev Kit
* Maven - Dependency Manager
* IntelliJ IDEA - IDE

**Project Structure**

* *Mangers* : The Managers directory includes classes for browser management, exception handling, and page object management. The Browser Factory class instantiates the web driver, the Framework Exception class handles and logs any exceptions that occur, and the Page Object Manager class creates instances of page-specific objects.

* *Page Objects* : The page objects directory contains web elements and associated methods organized by page. 

* *Utilities* : The Utilities package contains classes with utility methods. 
* *Features* : Test cases are written in Cucumber feature files for ease of understanding in the features directory.
* *Runner* : The runner directory contains the test runner file. 
* *Step Definiations* : Step definitions for each page can be found in the dtep definitions directory.
* *Configs* : The configs directory includes a properties file for passing data to the script, which is loaded and used for different values or data.

**Installation**

To set up the project in IntelliJ, open it in the IDE and run the appropriate command in the Terminal to build the project. This will automatically download all necessary dependencies.

`$ mvn clean install`

If the build is successful, it means that all necessary dependencies have been installed correctly. However, if the build fails, ensure to address any issues before attempting to run tests. Double check that the path for config.properties in the Property Reader class is set correctly according to your operating system environment.

**Execute Tests**

Cucumber test cases can be executed in a few different ways

1. Using a runner class and specifying tags or a feature file
2. From the command line:

a. To run all test cases, enter `mvn clean test`

b. To run a specific test case, use `mvn clean install -Dcucumber.options='--tags @AboutPage'`

3. Using a feature file.

4. Using a Scenario. Run the runner file , right click on the file then select Run option 

**Test Report**

Upon completion, we generate a report using the Extent Report plugin, which provides details on the feature files, scenarios, and steps that were executed during the test run.

Reports for each test run can be located in the designated folder.

*  RainDropProject/target/TestReport.html
*  RainDropProject/target/cucumber.json


