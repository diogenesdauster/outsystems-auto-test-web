package br.gruposer.gokursos.test;

import static org.junit.Assert.assertEquals;
import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.*;
import br.gruposer.gokursos.core.BaseTest;
import br.gruposer.gokursos.core.DriverFactory;
import br.gruposer.gokursos.evidencias.*;


public class LoginTest extends BaseTest {

@Test
	public void loginComSucesso() throws HeadlessException, InvalidFormatException, IOException, AWTException, InterruptedException {
		evi.iniciaEvidencia(); //Inicia evidência
		evi.inserePrintNoDoc(); //Print
		//1. Passa o mouse sobre o icone do usuário
		home.passarMouseSobreIconeDoUsuario(); evi.inserePrintNoDoc();//Print
		//2. Clica na opção de entrar
		home.clicarEmEntrar(); evi.inserePrintNoDoc();//Print
		//3. Informa o e-mail e a senha
		login.setEmail("isabela@teste.com");
		login.setSenha("isa@1234"); evi.inserePrintNoDoc();//Print
		//4. Clica no botão de tudo certo
		login.tudoCerto(); evi.inserePrintNoDoc();//Print
		//5. Valida que o usuário está logado
		home.validaQueUsuarioEstaLogado();
		Thread.sleep(2000);
		evi.inserePrintNoDoc();//Print
		//6. Conclui evidência com o nome informado
		evi.concluiEvidencia("[TESTE AUTOMATIZADO] - Login com sucesso");
		}

@Test
	public void loginComSenhaErrada() throws HeadlessException, InvalidFormatException, IOException, AWTException, InterruptedException {
		evi.iniciaEvidencia(); //Inicia evidência
		evi.inserePrintNoDoc(); //Print
		//1. Passa o mouse sobre o icone do usuário
		home.passarMouseSobreIconeDoUsuario(); evi.inserePrintNoDoc(); //Print
		//2. Clica na opção de entrar
		home.clicarEmEntrar(); evi.inserePrintNoDoc(); //Print
		//3. preenche o e-mail e a senha
		login.setEmail("isabela@teste.com"); 
		login.setSenha("1215613"); evi.inserePrintNoDoc(); //Print
		//4. Clica em tudo certo
		login.tudoCerto(); evi.inserePrintNoDoc(); //Print
		//5. Valida que a mensagem retornada no popup, é igual a E-mail ou senha inválida
		assertEquals("x\nE-mail ou senha inválida", login.obterMensagem()); evi.inserePrintNoDoc();
		//6. Conclui evidência
		evi.concluiEvidencia("[TESTE AUTOMATIZADO] -  Login com senha errada");
		}

@Test
	public void esqueciMinhaSenhaEmailCadastrado() throws HeadlessException, InvalidFormatException, IOException, AWTException, InterruptedException {
		evi.iniciaEvidencia(); //Inicia evidência
		evi.inserePrintNoDoc(); //Print
		//1. Passa o mouse sobre o icone do usuário
		home.passarMouseSobreIconeDoUsuario(); evi.inserePrintNoDoc(); //Print
		//2. Clica na opção de entrar
		home.clicarEmEntrar(); evi.inserePrintNoDoc(); //Print
		login.esqueciMinhaSenha();
		Thread.sleep(500);
		login.setEmailRecuperarSenha("isabela@teste.com");
		login.enviarRecuperarSenha();
		assertEquals("x\nE-mail enviado com sucesso", login.obterMensagem());
		evi.inserePrintNoDoc();
		evi.concluiEvidencia("[TESTE AUTOMATIZADO] - Esqueci minha senha, informando um e-mail cadastrado");
		}


@Test
	public void esquecirMinhaSenhaEmailNaoCadastrado() throws HeadlessException, InvalidFormatException, IOException, AWTException, InterruptedException {
		evi.iniciaEvidencia(); //Inicia evidência
		evi.inserePrintNoDoc(); //Print
		//1. Passa o mouse sobre o icone do usuário
		home.passarMouseSobreIconeDoUsuario(); evi.inserePrintNoDoc(); //Print
		//2. Clica na opção de entrar
		home.clicarEmEntrar(); evi.inserePrintNoDoc(); //Printlogin.esqueciMinhaSenha();
		Thread.sleep(500);
		//3. 
		login.setEmailRecuperarSenha("sdfgd@teste.com");
		//4.
		login.enviarRecuperarSenha();
		Thread.sleep(500);
		//5.
		assertEquals("x\nUsuário não encontrado", login.obterMensagem()); evi.inserePrintNoDoc();
		evi.concluiEvidencia("[TESTE AUTOMATIZADO] - Esqueci minha senha, informando um e-mail não cadastrado");
		}

@Test
	public void queroMeRegistrar() throws HeadlessException, InvalidFormatException, IOException, AWTException, InterruptedException   {
		evi.iniciaEvidencia(); //Inicia evidência
		evi.inserePrintNoDoc(); //Print
		//1. Passa o mouse sobre o icone do usuário
		home.passarMouseSobreIconeDoUsuario(); evi.inserePrintNoDoc(); //Print
		//2. Clica na opção de entrar
		home.clicarEmEntrar(); 
		evi.inserePrintNoDoc(); //Print
		login.registrar();
		cadastro.setNome("Manuel Levi Cavalcanti");
		cadastro.setCPF("27399462950"); 
		evi.inserePrintNoDoc(); //Print
		cadastro.tudoCerto();
		Thread.sleep(5000);
		evi.inserePrintNoDoc(); //Print
		cadastro.setEmail("manuel@teste.com");
		cadastro.setDataDeNascimento("02051996");
		cadastro.setTelefone("08195424131");
		cadastro.setSenha("123456");
		evi.inserePrintNoDoc(); //Print
		cadastro.Finalizar();
		cadastro.cadastroRealizadoSucesso();
		evi.inserePrintNoDoc(); //Print
		evi.concluiEvidencia("[TESTE AUTOMATIZADO] - Quero me registrar, registro realizado com sucesso.");
}

@Test
	public void queroMeRegistrarValidarCPFJaCadastrado() throws HeadlessException, InvalidFormatException, IOException, AWTException, InterruptedException  {
		evi.iniciaEvidencia(); //Inicia evidência
		evi.inserePrintNoDoc(); //Print
		//1. Passa o mouse sobre o icone do usuário
		home.passarMouseSobreIconeDoUsuario(); evi.inserePrintNoDoc(); //Print
		//2. Clica na opção de entrar
		home.clicarEmEntrar(); evi.inserePrintNoDoc(); //Print
		login.registrar();
				evi.inserePrintNoDoc();
		cadastro.setNome("Luiz Henry Ryan Mendes");
		cadastro.setCPF("48223795906");
				evi.inserePrintNoDoc();
		cadastro.tudoCerto();
				evi.inserePrintNoDoc();
		cadastro.aguardeProcessandoSolicitacao();
		Assert.assertEquals("CPF já cadastrado", cadastro.cpfJaCadastrado());
				evi.inserePrintNoDoc();
		evi.concluiEvidencia("[TESTE AUTOMATIZADO] - Quero me registrar, validar CPF ja cadastrado");
	}

}

