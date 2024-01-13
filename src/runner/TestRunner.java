package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/features",glue={"stepDefination"},monochrome=true, plugin="html:target/testreport/test.html ")
public class TestRunner  extends AbstractTestNGCucumberTests {
	
	

}
 