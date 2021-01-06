package br.pe.jp.pages;

import static br.pe.jp.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.pe.jp.core.BasePage;

public class BuscarPage extends BasePage{
	
	public void informarONomeEClicarEnter(String curso){
		acoes.escreverPlaceHolder("Buscar", curso);
		acoes.enterNoCampo(By.xpath("//input[@placeholder='Buscar']"));
		
	}
	
	public void clicarNoCursoSelecionado() {
		acoes.aguardarElementoFicarVisivel(By.xpath("//div[@class='__discovery_cursos_content']/a"));
		acoes.clicarNaOpcao(By.xpath("//div[@class='__discovery_cursos_content']/a"));
		
	}

}
