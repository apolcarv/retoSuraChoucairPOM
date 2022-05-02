package runner.front;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/feature/front/registro.feature"}
        , glue = {"StepDefinition"}
        , snippets =  SnippetType.CAMELCASE)
public class TestRunnersRegistro {
}
