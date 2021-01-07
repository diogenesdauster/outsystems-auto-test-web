package br.com.jp.cursos.pages;


import br.com.jp.cursos.core.Acoes;
import br.com.jp.cursos.core.BasePage;


public class DetalhesCursoPage extends BasePage {

	public void comprarCurso() {
		acoes.clicarNaOpcaoLinkPorTexto("Comprar Curso");
	}
}
