package stepdefinitions.charge;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/Charge.feature",
        glue = {"stepdefinitions.charge"})
public class ChargeRunner {
}
