package br.gruposer.gokursos.test;

import org.junit.Test;
import br.gruposer.gokursos.core.BaseTest;

public class ComprarPlanoTest extends BaseTest	{

	@Test
	public void realizarDiretaCompraDePlanoEmDestaques() throws InterruptedException {
		home.acessarPlanosDeAssinatura();
		planos.euQuero();
		planos.queroAssinar("Plano Especial");
		carrinho.comprarNoCartao();
		login.setEmail("isabela@teste.com");
		login.setSenha("isa@1234");
		login.tudoCerto();
		home.validaQueUsuarioEstaLogado();
		pagamento.gerarDadosCartao();
		pagamento.finalizarPagamento();
		
	}
	
}
