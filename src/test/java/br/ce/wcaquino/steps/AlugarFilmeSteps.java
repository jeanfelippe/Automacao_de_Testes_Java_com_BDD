package br.ce.wcaquino.steps;

import java.util.Calendar;

import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.NotaAluguel;
import br.ce.wcaquino.servicos.AluguelService;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.it.Date;
import junit.framework.Assert;

public class AlugarFilmeSteps {
	
	private Filme filme;
	private AluguelService aluguel= new AluguelService();
	private NotaAluguel nota;
	

@Given("^um filme com estoque de (\\d+) unidades$")
public void um_filme_com_estoque_de_unidades(int arg1) throws Throwable {
    filme=new Filme();
	filme.setEstoque(arg1);
}

@Given("^que o pre?o do aluguel seja R\\$ (\\d+)$")
public void que_o_pre_o_do_aluguel_seja_R$(int arg1) throws Throwable {
	filme.setAluguel(arg1);
}

@When("^alugar$")
public void alugar() throws Throwable {
   nota = aluguel.alugar(filme);
}

@Then("^o pre?o do aluguel ser? R\\$ (\\d+)$")
public void o_pre_o_do_aluguel_ser_R$(int arg1) throws Throwable {
    Assert.assertEquals(arg1,nota.getPreco());
}

@Then("^a data de entrega ser? no dia seguinte$")
public void a_data_de_entrega_ser_no_dia_seguinte() throws Throwable {
    Calendar cal=Calendar.getInstance();
    cal.add(Calendar.DAY_OF_MONTH,1);
    
    java.util.Date dataRetorno= nota.getDataEntrega();
    Calendar calRetorno= Calendar.getInstance();
    calRetorno.setTime(dataRetorno);
    
    Assert.assertEquals(cal.get(Calendar.DAY_OF_MONTH),calRetorno.get(Calendar.DAY_OF_MONTH));
    Assert.assertEquals(cal.get(Calendar.MONTH),calRetorno.get(Calendar.MONTH));
    Assert.assertEquals(cal.get(Calendar.YEAR),calRetorno.get(Calendar.YEAR));
}

@Then("^o estoque do filme ser? (\\d+) unidade$")
public void o_estoque_do_filme_ser_unidade(int arg1) throws Throwable {
    Assert.assertEquals(arg1,filme.getEstoque());
}

}
