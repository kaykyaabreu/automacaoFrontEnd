package steps;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import elementos.Elementos;
import metodos.Metodos;


public class Steps {
	
	Metodos m = new Metodos();
	Elementos e = new Elementos();
	
	@Given("^que o usuario acesse a url \"([^\"]*)\"$")
	public void que_o_usuario_acesse_a_url(String url) throws Throwable {
	    m.executarnavegador(url);
		
	}

	@Given("^preencher cpf$")
	public void preencher_cpf() throws Throwable {
		m.preencher(e.getCampoCPF(), "237.670.665-30", "Prenechendo cpf");
	   
	}

	@Given("^clicar no botao continuar$")
	public void clicar_no_botao_continuar() throws Throwable {
		m.click(e.getBntContinuar(), "clicando no botao continuar");
	    
	}

	@When("^preencher os demais campos$")
	public void preencher_os_demais_campos() throws Throwable {
	    m.preencher(e.getCampoEmail(), "allanaandrealopes@i9pneus.com.br", "preenchendo email");
	    m.preencher(e.getCampoNome(), "Allana Andrea Lopes", "preenchendo campo nome");
	    m.preencher(e.getCampoTelefone(), "(11) 98719-7116", "preenchendo campo telefone");
	    m.preencher(e.getCampoConfirmacaoEmail(), "allanaandrealopes@i9pneus.com.br", "preenchendo campo confirmacao email");
	}

	@When("^clicar no botao li e estao ciente$")
	public void clicar_no_botao_li_e_estao_ciente() throws Throwable {
	    m.click(e.getBtnLiEEstouCiente(), "clicando botao li e estou ciente");
	}

	@When("^clicar no botao enviar$")
	public void clicar_no_botao_enviar() throws Throwable {
	    m.click(e.getBtnEnviar(), "clicando no botao enviar");
	    m.conferirAssert(e.getMensagemfinal(), "Enviando seus dados", "conferindo assert");
	}


}
