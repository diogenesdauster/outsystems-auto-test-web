package br.com.jp.cursos.pages;

import static br.com.jp.cursos.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.jp.cursos.core.BasePage;
import br.com.jp.cursos.core.DriverFactory;

public class LoginPage extends BasePage {
	
	
	public void setEmail(String email)  {
		acoes.aguardarElementoFicarVisivel(By.xpath("//input[@placeholder='Qual seu e-mail?']"));
		acoes.escrever("email", email);
		}
	
	public void setSenha(String senha) {
		acoes.escrever("senha", senha);
		}
	
	public void tudoCerto() throws InterruptedException {
		Thread.sleep(100);
		acoes.clicarNoBotao("tudocerto");
		}
		
	public String obterMensagem() {
		acoes.aguardarElementoFicarVisivel(By.id("FeedbackMessageBody"));
		return acoes.retornaTexto(By.id("FeedbackMessageBody"));
		}
	
	public void fecharMensagem() {
		acoes.clicarNaOpcaoLinkPorTexto("x");
		}
	
	public void esqueciMinhaSenha() {
		acoes.aguardarElementoFicarVisivel(By.linkText("Esqueceu sua senha?"));
		acoes.clicarNaOpcaoLinkPorTexto("Esqueceu sua senha?");
		}
	
	public void setEmailRecuperarSenha(String valor) {
		acoes.aguardarElementoFicarVisivel(By.xpath("//div/p/input[@placeholder='Digite seu e-mail']"));
		acoes.escreverPlaceHolder("Digite seu e-mail", valor);
		}
	
	public void enviarRecuperarSenha() {
		acoes.aguardarElementoFicarVisivel(By.xpath("//button[span='Enviar']"));
		acoes.clicarNaOpcao(By.xpath("//button[span='Enviar']"));
		}

	public void registrar() {
		acoes.clicarNaOpcaoLinkPorTexto("Registrar");
		acoes.aguardarElementoFicarVisivel(By.linkText("Já tenho cadastro"));
	}
	
	public void aguardeProcessandoSolicitacao() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 50);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='ml-3']/h3")));
	}
	

}
