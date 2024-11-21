package persistencia;

import java.io.FileWriter;
import java.io.IOException;

import controller.Alunos;

public class Escrita {
	
	private FileWriter escritor;
	private String diretorioDoArquivo;
	
	public Escrita() {
		diretorioDoArquivo = "src\\dados\\saidaDeDados.txt";
	}
	
	public void salvarAluno(String str) {
		
		try {
			escritor = new FileWriter(diretorioDoArquivo);
			escritor.write(str);
			escritor.close();
		} catch (IOException e) {
			System.out.println("Excecao IOException - Classe Escritor");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Outra excecao - Classe Escritor");
			e.printStackTrace();
		}
		
	}

}
