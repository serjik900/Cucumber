package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //features we use to provide the path of all the feature files
        features = "src/test/resources/features/",
        glue = "steps",
        //when you set dryrun to true it stops actual excecution
        //it will quickly scan all gherkin steps whether they are implemented or not
       // dryRun = true
        //When we  set dry run to false, it starts execution again
        dryRun = false,
        tags = "@sprint3 or @sprint1",
        //to remove irrelevant info from console, you need to set monochrome to true
        monochrome= true,
        //pretty keyword prints the steps in the console to increase readability
        plugin={"pretty"}
)
public class SmokeRunner {
}