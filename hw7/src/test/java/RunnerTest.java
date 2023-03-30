import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/resources/scenarios",
            glue = "testCarHome",
            snippets = SnippetType.CAMELCASE,
            plugin = { "pretty", "html:target/Homework7.html" }
    )
    public class RunnerTest {
    }



