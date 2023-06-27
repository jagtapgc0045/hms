package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\ashis\\eclipse-workspace\\CucumberFramework\\Features//LoginFeature.feature",
		glue="StepDefinition",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","html:target/cucumber-folder/reports1_html.html","junit:target/cucumber-folder/reports1_html.xml","json:target/cucumber-folder/reports1_html.json"}
		)


public class Run {
	//This class will be empty

}
