package br.com.jp.cursos.test;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.junit.Test;

import br.com.jp.cursos.core.BaseTest;
import br.com.jp.cursos.pages.MeusPedidosPage;

public class ComprarPlanoTest extends BaseTest	{

	@Test
	public void realizarCompraDiretaDePlanoEmDestaques() throws InterruptedException, HeadlessException, InvalidFormatException, IOException, AWTException {
		evi.iniciaEvidencia();
		evi.inserePrintNoDoc();
		home.acessarPlanosDeAssinatura();
		evi.inserePrintNoDoc();
		planos.euQuero();
		evi.inserePrintNoDoc();
		planos.queroAssinar("Plano Especial");
		evi.inserePrintNoDoc();
		carrinho.comprarNoCartao();
		evi.inserePrintNoDoc();
		login.setEmail("claudia@teste.com");
		login.setSenha("claudia@17");
		evi.inserePrintNoDoc();
		login.tudoCerto();
		evi.inserePrintNoDoc();
		home.validaQueUsuarioEstaLogado();
		evi.inserePrintNoDoc();
		pagamento.gerarDadosCartao();
		evi.inserePrintNoDoc();
		pagamento.finalizarPagamento();
		Assert.assertEquals("Plano Especial", meusplanos.getNomeDoPlano() ); 
		evi.inserePrintNoDoc();
		evi.concluiEvidencia("[TESTE AUTOMATIZADO] - Realizar compra direta de planos em detaques");
		
	}
	
}
