package br.com.jp.cursos.test;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import br.com.jp.cursos.core.BaseTest;
import br.com.jp.cursos.core.DriverFactory;
import br.com.jp.cursos.evidencias.GerarEvidencias;
import br.com.jp.cursos.evidencias.InserirPrintsNoArquivoWord;
import br.com.jp.cursos.pages.*;

public class ComprarCursoTest extends BaseTest{

@Test
	public void realizarCompraCursoGratuitoIniciandoSemEstarLogado() throws HeadlessException, InvalidFormatException, IOException, AWTException, InterruptedException {
		evi.iniciaEvidencia(); // Inicia evidência
		evi.inserePrintNoDoc();// Print
		//1. No campo de buscar, informar o curso X, e clica enter para realizar a busca  	 
		buscar.informarONomeEClicarEnter("Chocolateria"); 	 	 
		evi.inserePrintNoDoc();// Print
		//2. Na tela de busca, clica no curso retornado	
		buscar.clicarNoCursoSelecionado(); 						
		evi.inserePrintNoDoc();// Print
		DetalheCurso.comprarCurso();							 
		evi.inserePrintNoDoc();// Print
		carrinho.finalizarCompra();						 		 
		evi.inserePrintNoDoc();// Print
		login.setEmail("pietro@teste.com");						 
		evi.inserePrintNoDoc();// Print
		login.setSenha("pietro@17"); 							 
		evi.inserePrintNoDoc();// Print
		login.tudoCerto();										 
		evi.inserePrintNoDoc();// Print
		home.validaQueUsuarioEstaLogado();
		Assert.assertEquals("GRÁTIS", pedidos.getStatusPedidoSucesso());	evi.inserePrintNoDoc();// Print
		evi.concluiEvidencia("[TESTE AUTOMATIZADO] - Realizar Compra de Curso Gratuito, iniciando fluxo sem está logado");
		}

	
@Test
	public void realizarCompraNoBoletoIniciandoSemEstarLogado() throws InterruptedException, HeadlessException, InvalidFormatException, IOException, AWTException {
		evi.iniciaEvidencia(); // Inicia evidência
		evi.inserePrintNoDoc();// Print
		//1. No campo de buscar, informar o curso X, e clica enter para realizar a busca  	  	
		buscar.informarONomeEClicarEnter("Energias Renováveis"); evi.inserePrintNoDoc();//print
		//2. Na tela de busca, clica no curso retornado	
		buscar.clicarNoCursoSelecionado(); evi.inserePrintNoDoc();//print
		//3. Na tela de detalhes do curso, clica em Comprar curso	
		DetalheCurso.comprarCurso(); evi.inserePrintNoDoc();//print
		//4. Na tela de checkout, clica em Comprar no boleto	
		carrinho.comprarNoBoleto();	evi.inserePrintNoDoc();//print
		//5. Na tela de login informar o email e a senha
		login.setEmail("isabela@teste.com");					
		login.setSenha("isa@1234"); evi.inserePrintNoDoc();//print
		//6. Na tela login, clicar em tudo certo
		login.tudoCerto(); evi.inserePrintNoDoc();//print
		//7. Valida que o usuário está logado
		home.validaQueUsuarioEstaLogado();
		//8. Valida que o status do pedido está como PAGAMENTO PENDENTE
		Assert.assertEquals("PAGAMENTO PENDENTE", pedidos.getStatusPedidoPendente()); evi.inserePrintNoDoc();
		//9. Conclui evidência
		evi.concluiEvidencia("[TESTE AUTOMATIZADO] - Realizar compra no Boleto, inicando fluxo sem está logado");
		
		}


	
@Test
public void realizarCompraNoCartãoIniciandoSemEstarLogado() throws HeadlessException, InvalidFormatException, IOException, AWTException, InterruptedException {
	
				evi.iniciaEvidencia(); // Inicia evidência
				evi.inserePrintNoDoc();// Print
		//1. No campo de buscar, informar o curso X, e clica enter para realizar a busca  		
		buscar.informarONomeEClicarEnter("Energias Renováveis");	evi.inserePrintNoDoc();// Print
		//2. Na tela de busca, clica no curso retornado		
		buscar.clicarNoCursoSelecionado(); 	evi.inserePrintNoDoc();// Print
		//3. Na tela de detalhes do curso, clica em Comprar curso		
		DetalheCurso.comprarCurso(); evi.inserePrintNoDoc();// Print
		//4. Na tela de checkout, selecionar ao opção de comprar no cartão	
		carrinho.comprarNoCartao();	evi.inserePrintNoDoc();// Print
		//5. Informar o email do usuário cadastrado	
		login.setEmail("isabela@teste.com");		
		//6. informar a senha do usuário cadastrado
		login.setSenha("isa@1234");	evi.inserePrintNoDoc();// Print
		//7. Clicar em tudo certo	
		login.tudoCerto(); evi.inserePrintNoDoc();// Print
		//8. Aguarda e valida o usuário ser logado na aplicação		
		home.validaQueUsuarioEstaLogado(); evi.inserePrintNoDoc();// Print		
		//9. Na tela de pedidos, clica em pagar com o cartão		
		pedidos.pagarComCartão(); evi.inserePrintNoDoc();// Print
		//10. Na tela do SERPAG, de pagamento, clica em preencher os dados; 		
		serpag.preencherDadosDoCartao(); evi.inserePrintNoDoc();// Print
		//11. Clica em pagar		
		serpag.clicarEmPagar(); evi.inserePrintNoDoc();// Print
		//12. Valida que o status do pagamento está como PAGAMENTO REALIZADO		
		Assert.assertEquals("PAGAMENTO REALIZADO", pedidos.getStatusPedidoSucesso()); evi.inserePrintNoDoc();
		//13. Conclui evidência
		evi.concluiEvidencia("[TESTE AUTOMATIZADO] - Realizar compra no Cartão, iniciando fluxo sem está logado");

		}


@Test
public void realizarCompraNoCartãoSeCadastrando() throws HeadlessException, InvalidFormatException, IOException, AWTException, InterruptedException {
	
				evi.iniciaEvidencia(); // Inicia evidência
				evi.inserePrintNoDoc();// Print
		//1. No campo de buascar, informar o curso X, e clicar enter para realizar a busca 
		buscar.informarONomeEClicarEnter("Energias Renováveis"); evi.inserePrintNoDoc();//Print
		//2. Na tela de busca, clica no curso retornado
		buscar.clicarNoCursoSelecionado();	evi.inserePrintNoDoc();//Print
		//3. Na tela de detalhes do curso, clica em Comprar curso		
		DetalheCurso.comprarCurso(); evi.inserePrintNoDoc();//Print
		//4. Na tela de checkout, clicar no botão de comprar no cartão
		carrinho.comprarNoCartao(); evi.inserePrintNoDoc();//Print
		//5. Na tela de login, clicar no botão de Quero me registrar		
		login.registrar(); evi.inserePrintNoDoc();//Print
		//6. Informar o nome
		cadastro.setNome("Marcelo Manoel Mendes"); evi.inserePrintNoDoc();//Print
		//7. Informar o CPF
		cadastro.setCPF("96008995171"); evi.inserePrintNoDoc();//Print
		//8. Clicar em tudo certo
		cadastro.tudoCerto();		
		Thread.sleep(5000);
		//9. Informar o E-mail, Data de nascmiento, Telefone e Senha
		cadastro.setEmail("marcelo@testes1.com");
		cadastro.setDataDeNascimento("02051996");
		cadastro.setTelefone("08195424131");
		cadastro.setSenha("123456"); evi.inserePrintNoDoc();//Print
		cadastro.Finalizar(); evi.inserePrintNoDoc();//Print
		//10. Mensagem de sucesso criado.
		cadastro.cadastroRealizadoSucesso(); evi.inserePrintNoDoc();//Print
		//11. Fechar mensagem	
		Thread.sleep(5000);
		cadastro.fecharMensagemDeSucesso();			
		//12. Aguardar e validar que o usuário cadastrado logou na aplicação		
		home.validaQueUsuarioEstaLogado(); evi.inserePrintNoDoc();//Print
		//13. Será carregado a tela de pedidos, e irá clicar no botão de pagar no cartão
		pedidos.pagarComCartão(); evi.inserePrintNoDoc();//Print
		//14.clicar no icone para preencher os dados do cartão	
		serpag.preencherDadosDoCartao(); evi.inserePrintNoDoc();//Print
		//15. Clicar no botão de pagar		
		serpag.clicarEmPagar(); evi.inserePrintNoDoc(); //Print
		//16. Validar na tEla de pedidos, que o status do pedido esta como PAGAMENTO REALIZADO 
		Assert.assertEquals("PAGAMENTO REALIZADO", pedidos.getStatusPedidoSucesso()); evi.inserePrintNoDoc();
		//17. Conclui evidência		
		evi.concluiEvidencia("[TESTE AUTOMATIZADO] - Realizar compra no Cartão, se cadastrando");
			
		}


}