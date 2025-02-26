import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import java.io.File;
import java.util.Collections;

public class GenerateReport {
    public static void main(String[] args) {
        // Diretório onde o relatório será salvo
        File reportOutputDirectory = new File("target/cucumber-html-report");

        // Caminho do JSON gerado pelos testes
        String jsonFile = "target/cucumber-reports/cucumber.json";

        // Configuração do relatório
        Configuration config = new Configuration(reportOutputDirectory, "Testes Selenium");
        config.addClassifications("Projeto", "Automação Selenium");
        config.addClassifications("Ambiente", "QA");
        config.addClassifications("Sistema", "Web");
        config.addClassifications("Navegador", "Chrome");

        // Gerar o relatório
        ReportBuilder reportBuilder = new ReportBuilder(Collections.singletonList(jsonFile), config);
        reportBuilder.generateReports();

        System.out.println("📊 Relatório gerado com sucesso em: " + reportOutputDirectory.getAbsolutePath());
    }
}
