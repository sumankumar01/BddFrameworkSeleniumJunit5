package hellocucumber;

import org.junit.platform.suite.api.*;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectPackages("hellocucumber")
@SelectClasspathResource("hellocucumber")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME,
        value="junit:target/cucumber-reports/Cucumber.xml, " +
                "json:target/cucumber-reports/Cucumber.json, " +
                "html:target/cucumber-reports/Cucumber.html, " +
                "timeline:target/cucumber-reports/CucumberTimeline," +
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:," +
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm")
public class RunCucumberTest {
}
