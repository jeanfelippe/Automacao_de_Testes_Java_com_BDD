package utils;

import java.io.File;
import java.util.Collections;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class GenerateReport {
	public static void main(String[] args) {
        File reportOutputDirectory = new File("target/cucumber-html-report");
        String jsonReport = "target/cucumber-reports/cucumber.json"; // JSON gerado pelos testes

        Configuration config = new Configuration(reportOutputDirectory, "Automação Selenium");
        config.addClassifications("Projeto", "Testes Selenium");
        config.addClassifications("Ambiente", "QA");
        config.addClassifications("Sistema", "Web");
        config.addClassifications("Navegador", "Chrome");

        ReportBuilder reportBuilder = new ReportBuilder(Collections.singletonList(jsonReport), config);
        reportBuilder.generateReports(); // Gera o relatório final
        
        System.out.println("📊 Relatório gerado com sucesso em: " + reportOutputDirectory.getAbsolutePath());
    }
}