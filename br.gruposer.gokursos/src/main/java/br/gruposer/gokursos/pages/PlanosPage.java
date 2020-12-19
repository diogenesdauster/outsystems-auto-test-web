package br.gruposer.gokursos.pages;

import org.openqa.selenium.By;

import br.gruposer.gokursos.core.BasePage;

public class PlanosPage extends BasePage{

	public void euQuero() {
		acoes.clicarNaOpcaoLinkPorTexto("Eu quero!");
	}
	
	public void queroAssinar(String plano) throws InterruptedException {
		Thread.sleep(500);
		acoes.clicarQueroAssinarDentroDoCardDePlanos(plano);
	}
	
	public void saibaMais(String plano) throws InterruptedException  {
		Thread.sleep(500);
		acoes.clicarSaibaMaisDentroDoCardDePlanos(plano);
	}
}