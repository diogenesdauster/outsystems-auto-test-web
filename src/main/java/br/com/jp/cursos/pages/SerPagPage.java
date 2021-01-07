package br.com.jp.cursos.pages;

import static br.com.jp.cursos.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.jp.cursos.core.BasePage;

public class SerPagPage extends BasePage{
	
	public void preencherDadosDoCartao() {
		acoes.aguardarElementoFicarVisivel(By.xpath("//span[@class='fa fa-fw fa-magic']"));
		acoes.clicarNaOpcao(By.xpath("//span[@class='fa fa-fw fa-magic']"));
		}
	
	public void clicarEmPagar() {
		acoes.clicarNaOpcao(By.xpath("//div[a='Pagar']"));
		}
}
