package stepdefinitions.precharge;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/RequestPreCharge.feature",
        glue = {"stepdefinitions.precharge"})
public class PreChargeRunner {
}
