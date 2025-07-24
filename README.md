# Coursera course 	<ins>Open-Source QA: Cypress, JMeter & xUnit Testing</ins>
## Practice Peer-graded Assignment: Hands-On-Learning: Write, Run & Automate: A Complete xUnit Test Workflow  

## Deliverable

* First JUnit test with JUnit 5 (jupiter) in a JAVA Maven project with automated testing using GitHub Actions.
* Contains Calculator class with methods for add, divide and multiply.
* Contains CalculatorTest class for testing and methods for testing add, add with zero, divide, divide by zero, multiply and multiply by zero.
* Contains .github/workflows folder structure with a ci.yml to automate testing in the CI workflow.

## Reflect

It is very importent to test method and functions in isolation to verify that they perform as expected and follow the specifications. Edge cases is most important to test because there is usually where an error will occur. It is also of importance to integrate the unit tests as automated tests in the CI workflow. Then the tests will run whenever a collaborative member push a code update. This will ensure that changes done to the code do not destroy other parts of the code.