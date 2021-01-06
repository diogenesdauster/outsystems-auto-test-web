package br.com.jp.cursos.core;

import static br.com.jp.cursos.core.DriverFactory.*;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.interactions.Actions;

import br.com.jp.cursos.evidencias.GerarEvidencias;
import br.com.jp.cursos.evidencias.InserirPrintsNoArquivoWord;
import br.com.jp.cursos.pages.*;


public class BaseTest {
	
	protected HomePage home;
	protected LoginPage login;
	protected DetalhesCursoPage DetalheCurso;
	protected CarrinhoPage carrinho;
	protected SerPagPage serpag;
	protected InserirPrintsNoArquivoWord print;
	protected GerarEvidencias evi;
	protected BuscarPage buscar;
	protected MeusPedidosPage pedidos;
	protected MeuCadastroPage cadastro;
	protected Actions builder;
	protected PlanosPage planos;
	protected PagamentoPlanosPage pagamento;
	protected MeusPlanosPage meusplanos;
	
	@Before
	public void inicializacao() {
		getDriver().get("https://qamthomol.gokursos.com/"); 
		home = new HomePage();
		login = new LoginPage();
		DetalheCurso = new DetalhesCursoPage();
		carrinho = new CarrinhoPage();
		serpag = new SerPagPage();
		print = new InserirPrintsNoArquivoWord();
		evi = new GerarEvidencias();
		buscar = new BuscarPage();
		pedidos = new MeusPedidosPage();
		cadastro = new MeuCadastroPage();
		builder = new Actions(getDriver());
		planos = new PlanosPage();
		pagamento = new PagamentoPlanosPage();
		meusplanos = new MeusPlanosPage();
	}

	
	@After
	public void Conclusão() throws InterruptedException {
		if(Propriedades.FECHAR_BROWSER) {
			killDriver();
		} 
		
	}

}
