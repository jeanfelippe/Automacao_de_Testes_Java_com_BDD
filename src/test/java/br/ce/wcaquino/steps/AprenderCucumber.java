package br.ce.wcaquino.steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import cucumber.api.java.en.Then;


import cucumber.api.PendingException;

public class AprenderCucumber {


    @Given("^que criei o arquivo corretamente$")
    public void que_criei_o_arquivo_corretamente() throws Throwable{

    }

    @When("^executa-lo$")
    public void executa_lo() throws Throwable{

    }

    @Then("^a especificacao deve finalizar com sucesso$")
    public void a_especificacao_deve_finalizar_com_sucesso() throws Throwable{

    }
    

    private int contador=0;
    
    @Given("^que o valor do contador e (\\d+)$")
    public void queOValorDoContador(int arg1) throws Throwable {
       contador=arg1;
    }

    @When("^eu incrementar em (\\d+)$")
    public void euIncrementarEm(int arg1) throws Throwable {
       contador=contador+arg1;
    }

    @Then("^o valor do contador sera (\\d+)$")
    public void oValorDoContadorSer(int arg1) throws Throwable {
        //System.out.println(arg1);
        //System.out.println(contador);
        //System.out.println(arg1==contador);
        Assert.assertEquals(arg1,contador);
    	
    }

}
