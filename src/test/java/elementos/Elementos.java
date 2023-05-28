package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	private By campoCPF = By.id("field-cpf");
	private By bntContinuar = By.cssSelector("#short-form > div.sc-ksNGjt.gDytHF > button");
	private By campoNome = By.id("field-name");
	private By campoTelefone = By.id("field-phone");
	private By campoEmail = By.id("field-email");
	private By campoConfirmacaoEmail = By.id("field-emailConfirmation");
	private By btnLiEEstouCiente = By.cssSelector("#label-accepted > span.sc-bYWUiG.gaLLqc > svg");
	private By btnEnviar = By.cssSelector("#complete-form-drawer > div > div > div.sc-kxtUkE.jKEmYc > form > div > div.sc-dsKijY.dTZaxR > div > button");
	private By mensagemfinal = By.cssSelector("#complete-form-drawer > div > div > div.sc-kxtUkE.jKEmYc > div > div > div > p");
	
	

	

	public By getMensagemfinal() {
		return mensagemfinal;
	}

	public void setMensagemfinal(By mensagemfinal) {
		this.mensagemfinal = mensagemfinal;
	}

	public By getBtnEnviar() {
		return btnEnviar;
	}

	public void setBtnEnviar(By btnEnviar) {
		this.btnEnviar = btnEnviar;
	}

	public By getCampoNome() {
		return campoNome;
	}

	public void setCampoNome(By campoNome) {
		this.campoNome = campoNome;
	}

	public By getCampoTelefone() {
		return campoTelefone;
	}

	public void setCampoTelefone(By campoTelefone) {
		this.campoTelefone = campoTelefone;
	}

	public By getCampoEmail() {
		return campoEmail;
	}

	public void setCampoEmail(By campoEmail) {
		this.campoEmail = campoEmail;
	}

	public By getCampoConfirmacaoEmail() {
		return campoConfirmacaoEmail;
	}

	public void setCampoConfirmacaoEmail(By campoConfirmacaoEmail) {
		this.campoConfirmacaoEmail = campoConfirmacaoEmail;
	}

	public By getBtnLiEEstouCiente() {
		return btnLiEEstouCiente;
	}

	public void setBtnLiEEstouCiente(By btnLiEEstouCiente) {
		this.btnLiEEstouCiente = btnLiEEstouCiente;
	}

	public By getBntContinuar() {
		return bntContinuar;
	}

	public void setBntContinuar(By bntContinuar) {
		this.bntContinuar = bntContinuar;
	}

	public By getCampoCPF() {
		return campoCPF;
	}

	public void setCampoCPF(By campoCPF) {
		this.campoCPF = campoCPF;
	}
	

}
