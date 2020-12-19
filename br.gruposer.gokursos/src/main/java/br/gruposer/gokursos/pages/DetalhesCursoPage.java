package br.gruposer.gokursos.pages;


import br.gruposer.gokursos.core.Acoes;
import br.gruposer.gokursos.core.BasePage;


public class DetalhesCursoPage extends BasePage {

	public void comprarCurso() {
		acoes.clicarNaOpcaoLinkPorTexto("Comprar Curso");
	}
}
