package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)  //Test will execute from here

 //this map feature file with step defination file
@CucumberOptions(
		features="src/test/java/features",
		glue= {"stepDefination"},
		tags={"@script2part1"}
		)
public class testRunnerClass {
	
	

}
