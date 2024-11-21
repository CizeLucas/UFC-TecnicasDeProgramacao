package controller;

import java.util.ArrayList;

import persistencia.Escrita;
import persistencia.Leitura;

public class DadosAlunos {
	
	private ArrayList<Alunos> arrayDeAlunos;
	private Leitura leitura;
	private Escrita escrita;
	
	public DadosAlunos() {
		arrayDeAlunos = new ArrayList<Alunos>();
		escrita = new Escrita();
		leitura = new Leitura(this);
		leitura.instanciarAlunos();
	}
	
	
	
	public void salvarAlunos() {
		String strParaSalvar="";
		for (Alunos aluno : arrayDeAlunos) {
			strParaSalvar += (aluno.getNome()+";"+aluno.getCpf()+";"+aluno.getMatricula()+";"+aluno.getVertente()+"\n");
		}
		escrita.salvarAluno(strParaSalvar);
	}
	
	public void criarNovoAluno(String nome, String cpf, String matricula, String vertente) {
		
		Alunos alunoTemp = new Alunos(nome, cpf, this.parseIntMatricula(matricula), vertente);
		
		if(!arrayDeAlunos.contains(alunoTemp)) {
			arrayDeAlunos.add(alunoTemp);
			this.salvarAlunos();
		}

	}
	
	public void atualizarAluno(String matricula, String novaVertente) {
		int intMatricula = this.parseIntMatricula(matricula);
		
		for (int i=0; i<arrayDeAlunos.size(); i++) 
			if(arrayDeAlunos.get(i).getMatricula() == intMatricula) {
				arrayDeAlunos.get(i).setVertente(novaVertente);
				this.salvarAlunos();
			}

	}
	
	public void deletarAluno(String matricula) {
		int intMatricula = this.parseIntMatricula(matricula);
		
		for (int i=0; i<arrayDeAlunos.size(); i++) 
			if(arrayDeAlunos.get(i).getMatricula() == intMatricula) {
				arrayDeAlunos.remove(i);
				this.salvarAlunos();
			}

	}
	
	public void printarAlunos() {
		for (Alunos aluno : arrayDeAlunos) {
			System.out.println(aluno.getNome()+" "+aluno.getCpf()+" "+aluno.getMatricula()+" "+aluno.getVertente());
		}
		if(arrayDeAlunos.size()==0) {
			System.out.println("arrayDeAlunos vazio");
		}
	
		
	}
	
	private int parseIntMatricula(String strMatricula) {
		try {
			return Integer.parseInt(strMatricula);
		}catch (Exception e) {
			System.out.println("parseInt deu ruim :(");
			return -1;
		}
	}
	
	public ArrayList<Alunos> getArrayList() {
		return arrayDeAlunos;
	}
	
}
