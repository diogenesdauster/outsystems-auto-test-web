package br.pe.jp.suites;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.pe.jp.test.ComprarCursoTest;
import br.pe.jp.test.ComprarPlanoTest;
import br.pe.jp.test.LoginTest;


@RunWith(Suite.class)
@SuiteClasses({
	ComprarPlanoTest.class, 
}
	)

public class SuiteTeste {


}
