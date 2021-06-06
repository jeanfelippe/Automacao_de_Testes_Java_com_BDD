package br.ce.wcaquino.runners;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.cucumber.junit.Cucumber;




@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features/inserir_conta.feature",
		glue="br.ce.wcaquino.steps",
		tags= {"~@ignore"},
        plugin="pretty",
        monochrome=true,
        snippets=SnippetType.CAMELCASE,
        dryRun=false,
        strict=false
)

public class Runner {



}
