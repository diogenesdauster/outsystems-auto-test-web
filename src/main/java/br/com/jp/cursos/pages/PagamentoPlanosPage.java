package br.com.jp.cursos.pages;

import org.openqa.selenium.By;

import br.com.jp.cursos.core.BasePage;

public class PagamentoPlanosPage extends BasePage {
	
	public void gerarDadosCartao() {
		acoes.clicarNaOpcao(By.xpath("//span[@class='fa fa-fw fa-magic']"));
	}
	
	public void finalizarPagamento() {
		acoes.clicarNaOpcaoLinkPorTexto("Finalizar Pagamento");
	}

	public void validaMsgPagamentoComSucesso() {
		
	}
		
}
