package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\user\\eclipse-workspace\\FreeCRMBDDFramwork\\src\\main\\java\\Features\\MapContact.feature", //the path of the feature files
		glue={"stepdefinations"}, //the path of the step definition files
		format = {"pretty","html:test-outout","json:json_output/cucumber.json"},// to Generate report format
		monochrome =true,// Dispaly the console output in proper readable format
		strict=true,
		dryRun=false
		
		
		)

public class TestRunner {
	
	

}
