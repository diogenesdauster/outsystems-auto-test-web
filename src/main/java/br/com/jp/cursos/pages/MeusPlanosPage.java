package br.com.jp.cursos.pages;

import org.openqa.selenium.By;

import br.com.jp.cursos.core.BasePage;

public class MeusPlanosPage extends BasePage{

	public String getNomeDoPlano() {
		acoes.aguardarElementoFicarVisivel(By.xpath("//h4/a"));
		return acoes.retornaTexto(By.xpath("//h4/a"));
	}

	
}
