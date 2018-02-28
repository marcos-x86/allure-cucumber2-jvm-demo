package allure.cucumber2.jvm.demo.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * It is in charge to set properties for the test execution.
 */
@CucumberOptions(
        format = {"pretty"},
        features = {"src/test/resources/features"},
        glue = {"allure.cucumber2.jvm.demo"})
public class Runner extends AbstractTestNGCucumberTests {
}
