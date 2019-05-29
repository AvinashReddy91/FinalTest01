
package mashreqBankTest.cucumber.testRunner;
 
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/"
		,glue={"mashreqBankTest.StepDef"},
		tags= {"@MASHREQBankTestSuite"} //@MASHREQBankTestSuite,@TestCase01,@TestCase02
		)
 
public class TestRunner  {
 
}