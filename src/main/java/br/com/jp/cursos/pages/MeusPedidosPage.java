package br.com.jp.cursos.pages;

import static br.com.jp.cursos.core.DriverFactory.getDriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.jp.cursos.core.BasePage;
import br.com.jp.cursos.core.DriverFactory;


public class MeusPedidosPage extends BasePage {
	
public void pagarComCartão() throws InterruptedException {
		acoes.aguardarElementoFicarVisivel(By.linkText("PAGAR COM CARTÃO"));
		acoes.clicarNaOpcaoLinkPorTexto("PAGAR COM CARTÃO");
		Thread.sleep(1000);
		//Muda o foco para a nova aba aberta
		DriverFactory.getDriver().switchTo().window((String) DriverFactory.getDriver().getWindowHandles().toArray()[1]);	
	}

public String getStatusPedidoSucesso() {
		acoes.aguardarElementoFicarVisivel(By.xpath("//div[@class='badge badge-success']"));
		return acoes.retornaTexto(By.xpath("//div[@class='badge badge-success']"));
	}

public String getStatusPedidoPendente() {
		acoes.aguardarElementoFicarVisivel(By.xpath("//div[@class='badge badge-warning']"));
		return acoes.retornaTexto(By.xpath("//div[@class='badge badge-warning']"));
	}


}
