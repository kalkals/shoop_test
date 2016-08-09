package cucumber.bdd;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;
@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, format = {"pretty", "html:target/cucumber","json:target/cucumber-report.json"}, features="src/test/feature/cucumber/bdd", tags={"@login"}
		)
public class RunTest
{

}
