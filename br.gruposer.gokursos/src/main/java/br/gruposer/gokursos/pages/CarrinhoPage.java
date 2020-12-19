package br.gruposer.gokursos.pages;

import static br.gruposer.gokursos.core.DriverFactory.getDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.gruposer.gokursos.core.BasePage;

public class CarrinhoPage extends BasePage {

	
	public void comprarNoBoleto() {
		acoes.aguardarElementoFicarVisivel(By.linkText("Comprar no boleto"));
		acoes.clicarNaOpcaoLinkPorTexto("Comprar no boleto");
	}

	public void comprarNoCartao() {
		acoes.aguardarElementoFicarVisivel(By.linkText("Comprar no cartão"));
		acoes.clicarNaOpcaoLinkPorTexto("Comprar no cartão");
		
	}	
	
	public void finalizarCompra() {
		acoes.aguardarElementoFicarVisivel(By.linkText("Finalizar Compra"));
		acoes.clicarNaOpcaoLinkPorTexto("Finalizar Compra");

	}
	
}
