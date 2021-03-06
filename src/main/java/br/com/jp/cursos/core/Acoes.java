package br.com.jp.cursos.core;

import static br.com.jp.cursos.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Acoes {

	protected Actions actionSelenium = new Actions(DriverFactory.getDriver());
	
	public void escreverPlaceHolder(String placeHolder, String Valor) {
		getDriver().findElement(By.xpath("//input[@placeholder='"+placeHolder+"']")).sendKeys(Valor);
	}

	public void escrever(String campo, String valor) {
		getDriver().findElement(By.cssSelector("input[os-test-input="+campo+"]")).sendKeys(valor);
		
	}
	public void enterNoCampo(By by) {
		getDriver().findElement(by).sendKeys(Keys.ENTER);
	}
	public void clicarNaOpcaoLinkPorTexto(String link) {
		getDriver().findElement(By.linkText(link)).click();
	}

	public void aguardarElementoFicarVisivel(By by) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 50);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
	}

	public void clicarNaOpcao(By by) {
		getDriver().findElement(by).click();
	}

	public void clicarNoBotao(String campo) {
		getDriver().findElement(By.cssSelector("button[os-test-button="+campo+"]")).click();
	}
	
	public String retornaTexto(By by) {
		return getDriver().findElement(by).getText();
	}
	
	public void simulaMousePassandoPeloElemento(By by) {
		actionSelenium.moveToElement((DriverFactory.getDriver().findElement(by))).perform();
	} 
	
	public void clicarQueroAssinarDentroDoCardDePlanos(String plano) {
		getDriver().findElement(By.xpath("//div[@class='header']/div[div='"+plano+"']/../../div/div/input[@value='Quero assinar']")).click();
	}
	
	public void clicarSaibaMaisDentroDoCardDePlanos(String plano) {
		getDriver().findElement(By.xpath("//div[@class='header']/div[div='"+plano+"']/../../div/div/a")).click();
	}
	
	public void aguardarElementoFicarClicavel(By by) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 5000);
		wait.until(ExpectedConditions.elementToBeClickable((by)));
	}
}
