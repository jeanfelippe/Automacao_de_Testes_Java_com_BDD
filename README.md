# Automacao_de_Testes_Java_com_BDD
Curso de Automação de Testes Utilizando Java com Selenium Webdriver em conjunto com o Cucumber.

Créditos ao curso: https://www.udemy.com/course/cucumber-java/

Curso foi utilizado como referência para piloto do projeto.



# [Escopo]:

Realizar automação de testes utilizando a linguagem Java e utilização da linguagem gherkin para escrita dos testes.

Utilização do Cucumber para os Testes Automatizados e utilização do projeto para melhorias e futuras implementações.



# [Frameworks]:

_Selenium

_Cucumber


# [Conceitos/Metodologia]:
_PageObjects;

_BDD

_CleanCode;

_Reports;

# [Reports/Relatórios]:

_Extent Report(gerado no diretório target\cucumber-reports\advanced-reports\extentreports);

_Cucumber Report Masterthought(localizado em target\cucumber-html-report\cucumber-html-reports, necessário executar comando = mvn exec:java -Dexec.mainClass="GenerateReport");


# [Atalhos e dicas Eclipse]:

_Control + F11= Reexecuta a ultima execução

_Converter o Projeto em um Projeto Cucumber(Geralmente ficamos impossibilitado de navegar entre os steps segurando o control e encontramos outros bloqueios quando o projeto não está no modo cucumber = Clicar no projeto com botão direito e em seguida, clicar em Configure>Convert to Cucumber Project

_Localização do ChromeDriver
C:\Users\Jean\drivers\chromedriver\chromedriver

_Pressionar o Control sobre o step permite navegar até a implementação automatizada daquele step

# [Funções úteis]:


_Gerar 3 numeros randomicos=
private static int numeroRandomico;
static {
	Random random = new Random();
	int numeroRandomico = random.nextInt(100); // Gera um número entre 0 e 99	
}



# [Maven]:

_Executar o arquivo runner utilizando comando Maven = mvn test -Dtest=Runner

_Executar comando para gerar report Cucumber Report Masterthought = mvn exec:java -Dexec.mainClass="GenerateReport"








