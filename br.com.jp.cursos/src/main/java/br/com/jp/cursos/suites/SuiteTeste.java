package br.com.jp.cursos.suites;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.jp.cursos.test.ComprarCursoTest;
import br.com.jp.cursos.test.ComprarPlanoTest;
import br.com.jp.cursos.test.LoginTest;


@RunWith(Suite.class)
@SuiteClasses({
	ComprarPlanoTest.class, 
}
	)

public class SuiteTeste {


}
