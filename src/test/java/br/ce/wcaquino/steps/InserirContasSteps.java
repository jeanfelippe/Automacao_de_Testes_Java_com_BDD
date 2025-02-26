package br.ce.wcaquino.steps;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class InserirContasSteps {
	
	private WebDriver driver;
	

@Given("^que estou acessando a aplicacao$")
public void que_estou_acessando_a_aplica_o() throws Throwable {
<<<<<<< HEAD
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Jean\\\\drivers\\\\chromedriver\\\\chromedriver.exe");
=======
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Jean\\drivers\\chromedriver\\chromedriver.exe");
>>>>>>> ffb58c7 (melhorias de report e melhorias logicas)
    driver = new ChromeDriver();
    driver.get("https://seubarriga.wcaquino.me/");
}

@When("^informo o usuario \"([^\"]*)\"$")
public void informo_o_usu_rio(String arg1) throws Throwable {
    driver.findElement(By.id("email")).sendKeys(arg1);
}

@When("^a senha \"([^\"]*)\"$")
public void a_senha(String arg1) throws Throwable {
	driver.findElement(By.name("senha")).sendKeys(arg1);
}

@When("^seleciono entrar$")
public void seleciono_entrar() throws Throwable {
    driver.findElement(By.tagName("button")).click();
}

@Then("^visualizo a pagina inicial$")
public void visualizo_a_p_gina_inicial() throws Throwable {
	String texto=driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
	assertEquals("Bem vindo, a!", texto);
}

@When("^seleciono Contas$")
public void seleciono_Contas() throws Throwable {
	driver.findElement(By.linkText("Contas")).click();
}

@When("^seleciono Adicionar$")
public void seleciono_Adicionar() throws Throwable {
	driver.findElement(By.linkText("Adicionar")).click();
}

<<<<<<< HEAD


private static int numeroRandomico;

static {
	Random random = new Random();
	numeroRandomico = random.nextInt(1000); // Gera um número entre 0 e 99
	
=======
//Precisei utilizar variavel static para que o numero randomico não altere durante a 
//mesma execução
private static int numeroRandomico;
static {

Random random = new Random();
numeroRandomico = random.nextInt(1000);
>>>>>>> ffb58c7 (melhorias de report e melhorias logicas)
}



<<<<<<< HEAD
=======
//int argumentoRandomico=arg1+numeroRandomico;
>>>>>>> ffb58c7 (melhorias de report e melhorias logicas)

@When("^informo a conta \"([^\"]*)\"$")
public void informo_a_conta(String arg1) throws Throwable {
	driver.findElement(By.id("nome")).sendKeys(arg1+numeroRandomico);
}

@When("^seleciono Salvar$")
public void seleciono_Salvar() throws Throwable {
	driver.findElement(By.tagName("button")).click();
}

@Then("^a conta e inserida com sucesso$")
public void a_conta_inserida_com_sucesso() throws Throwable {
	String texto=driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
	assertEquals("Conta adicionada com sucesso!", texto);
}

@Then("^sou notificado que o nome da conta e obrigatorio$")
public void souNotificadoQueONomeDaContaEObrigatorio() throws Throwable {
	String texto=driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
	assertEquals("Informe o nome da conta", texto);
    
}

@Then("^sou notificado que ja existe uma conta com esse nome$")
public void souNotificadoQueJaExisteUmaContaComEsseNome() throws Throwable {
	String texto=driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
	assertEquals("Já existe uma conta com esse nome!", texto);
}





@Before
public void inicio() {
	System.out.println("come�ando aqui");
}


@After(order=1)
public void screenshot(Scenario cenario) {
	File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
	FileUtils.copyFile(file, new File("target//screenshot//"+ cenario.getName()+ ".jpg"));
	}catch (IOException e) {
		e.printStackTrace();
	}
}

@After(order=0)
public void fecharBrowser() {
	driver.quit();
	System.out.println("terminando");
}

}
