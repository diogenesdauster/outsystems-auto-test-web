package br.gruposer.gokursos.evidencias;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class GerarEvidencias {
	
	InserirPrintsNoArquivoWord ImprEvi;
	
	public void inserePrintNoDoc() throws InvalidFormatException, IOException, HeadlessException, AWTException {
		ImprEvi.OpenFile();
		ImprEvi.screenshoot();
	}
	
	public void iniciaEvidencia() throws HeadlessException, InvalidFormatException, IOException, AWTException {
		
		ImprEvi.defineVariaveis();
	}
	
	public void concluiEvidencia(String NomeArquivo) throws IOException, InterruptedException  {
		Thread.sleep(300);
		ImprEvi.CloseFile("C:\\Workspace_gokursos\\br.gruposer.gokursos\\target\\Screen\\"+NomeArquivo+".docx");
		
	}

}
