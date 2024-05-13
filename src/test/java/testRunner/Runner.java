package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"FeatureFiles/AddEmployee.feature"}, glue = { "stepDefinations"}, monochrome = true , tags = "@addEmp")
public class Runner {

}
