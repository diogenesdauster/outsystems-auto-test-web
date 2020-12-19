package br.gruposer.gokursos.pages;

import static br.gruposer.gokursos.core.DriverFactory.getDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.gruposer.gokursos.core.BasePage;
import br.gruposer.gokursos.core.DriverFactory;
import br.gruposer.gokursos.evidencias.InserirPrintsNoArquivoWord;

public class HomePage extends BasePage{
	
private InserirPrintsNoArquivoWord print = new InserirPrintsNoArquivoWord();

	public void abrirTodasCategorias(){
		acoes.clicarNaOpcaoLinkPorTexto("Cursos");
		acoes.clicarNaOpcaoLinkPorTexto("Todos");
	}
	
	public void validaQueUsuarioEstaLogado() {
		 acoes.aguardarElementoFicarVisivel(By.xpath("//a/span/font[@class='text-muted font-weight-normal']"));
	}
	
	public void passarMouseSobreIconeDoUsuario() {
		acoes.simulaMousePassandoPeloElemento(By.xpath("//div[@class='OSInline']"));
	}
	
	public void clicarEmEntrar() {
		acoes.clicarNaOpcaoLinkPorTexto("Entrar");
	}
	
	public void acessarPlanosDeAssinatura() {
		acoes.clicarNaOpcaoLinkPorTexto("Planos de Assinatura");
	}

}
