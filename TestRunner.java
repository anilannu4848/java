package automation;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	//@CucumberOptions(features = "src\\test\\resources\\features\\HRM.feature",name = "Login",plugin = "html:Reports.html")
    
	@CucumberOptions(features = "src\\test\\resources\\features\\HRM.feature",name = "Login",plugin = "html:reports.html")
	public class TestRunner extends AbstractTestNGCucumberTests{
}

