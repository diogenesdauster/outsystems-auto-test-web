package br.gruposer.gokursos.pages;

import static br.gruposer.gokursos.core.DriverFactory.getDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.gruposer.gokursos.core.BasePage;

public class MeuCadastroPage extends BasePage {

	
	public void setNome(String valor) {
		acoes.aguardarElementoFicarVisivel(By.xpath("//input[@placeholder='Qual seu nome?']"));
		acoes.escrever("nome", valor);
	}
	
	public void setCPF(String valor) {
		acoes.escrever("cpf", valor);
	}

	public void setEmail(String valor) {
		acoes.escrever("email", valor);
	}
	
	public void setDataDeNascimento(String valor) {
		acoes.escrever("nascimento", valor);
	}
	
	public void setTelefone(String valor) {
		acoes.escrever("telefone", valor);
	}
	
	public void setSenha(String valor) {
		acoes.escrever("senha", valor);
		acoes.escrever("confirmasenha", valor);
	}
	
	public void aguardeProcessandoSolicitacao() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 100);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div/h3")));
	}

	public String cpfJaCadastrado() {
		acoes.aguardarElementoFicarVisivel(By.xpath("//div[span='CPF já cadastrado']"));
		return acoes.retornaTexto(By.xpath("//div[span='CPF já cadastrado']"));
		
	}

	public void Finalizar() {
		acoes.clicarNaOpcaoLinkPorTexto("Finalizar");
	}
	
	public void cadastroRealizadoSucesso() {
		acoes.aguardarElementoFicarVisivel(By.xpath("//div[p='Agora você já pode ver nossa lista de cursos e escolher o que mais combina com você.']"));
	}
	
	public void fecharMensagemDeSucesso() {
		acoes.clicarNaOpcao(By.xpath("//div[@class='modal-body']/button"));
	}
	
	public void tudoCerto() {
		acoes.clicarNaOpcaoLinkPorTexto("Tudo certo!");
	}
	
}
