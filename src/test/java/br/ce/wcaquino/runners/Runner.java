package br.ce.wcaquino.runners;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.cucumber.junit.Cucumber;




@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features/inserir_conta.feature",
		glue="br.ce.wcaquino.steps",
<<<<<<< HEAD
		tags= {"~@ignore"},
				plugin={"pretty",
		        		"html:target/cucumber-html-report",
		        		"json:target/cucumber-reports/cucumber.json",
		        		"junit:target/cucumber-reports/cucumber.xml",
		        		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		        		"html:target/cucumber-reports.html", // Gera um relatório HTML
		                "json:target/cucumber-reports.json", // Gera um JSON para relatórios customizados
		                "junit:target/cucumber-reports.xml" // Gera um XML compatível com Jenkins
				},
=======
		tags= "~@ignore",
				plugin = {
				        "pretty",
				        "html:target/cucumber-reports", // Gera um único arquivo HTML
				        //"json:target/cucumber-reports.json"
				        "html:target/cucumber-html-report",
				        "json:target/cucumber-reports/cucumber.json",
				        "json:target/cucumber.json",
				        "junit:target/cucumber-reports/cucumber.xml",
				        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				    },
		//plugin="pretty",
>>>>>>> ffb58c7 (melhorias de report e melhorias logicas)
        monochrome=true,
        snippets=SnippetType.CAMELCASE,
        dryRun=false
)

public class Runner {



}