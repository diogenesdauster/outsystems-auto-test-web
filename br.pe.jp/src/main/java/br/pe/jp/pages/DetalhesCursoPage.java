package br.pe.jp.pages;


import br.pe.jp.core.Acoes;
import br.pe.jp.core.BasePage;


public class DetalhesCursoPage extends BasePage {

	public void comprarCurso() {
		acoes.clicarNaOpcaoLinkPorTexto("Comprar Curso");
	}
}
