package runner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src\\test\\resources\\ApplicationTest\\LoginWithData.feature"},
		glue= {"steps"},
		plugin="pretty"
		
		)

public class LoginWithDataRunner {
	
	

}
