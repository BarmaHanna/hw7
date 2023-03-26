import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/java/hw7",
            glue = "by.barma.test",
            tags = "@withdrawal",
            snippets = SnippetType.CAMELCASE
    )
    public class RunnerTest {
    }


