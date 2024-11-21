package persistencia;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import controller.Alunos;
import controller.DadosAlunos;

public class Leitura {
	
	private String diretorioDoArquivo;
	//private FileReader arquivo;
	private BufferedReader leitor;
	private DadosAlunos alunos;
	
	public Leitura(DadosAlunos alunos) {
		this.alunos = alunos;
		
		diretorioDoArquivo = "src\\dados\\saidaDeDados.txt";
		
			try {
				leitor = new BufferedReader(new FileReader(diretorioDoArquivo));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

			
	}
	
	// nome; CPF; Matricula; Vertente;
	// Cize Lucas; 184.047.483-00; 478242; Computacao
	
	public void instanciarAlunos() {
		
		try {
			
			while (leitor.ready()) { 	
				String[] strTemp = leitor.readLine().split(";");
				alunos.criarNovoAluno(strTemp[0], strTemp[1], strTemp[2], strTemp[3]);
			}
			leitor.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("excecao IOException - Classe Leitura");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("outra excecao - Classe Leitura");
		}
		
		//alunos.printarAlunos();
	}
	
}
