package br.gruposer.gokursos.suites;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import br.gruposer.gokursos.test.ComprarCursoTest;
import br.gruposer.gokursos.test.ComprarPlanoTest;
import br.gruposer.gokursos.test.LoginTest;


@RunWith(Suite.class)
@SuiteClasses({
	ComprarPlanoTest.class, 
	ComprarCursoTest.class
	
}
	)

public class SuiteTeste {


}
