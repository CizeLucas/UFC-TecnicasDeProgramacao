package controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import persistencia.*;

public class Alunos {
	
	private String nome;
	private String cpf;
	private int matricula;
	private String vertente;
//	private ArrayList<Alunos> arrayDeAlunos;
//	private Leitura leitura;
	private Escrita escrita;
	
//	public Alunos() {
//		arrayDeAlunos = new ArrayList<Alunos>();
//		leitura = new Leitura(this);
//		leitura.instanciarAlunos();
//		escrita = new Escrita();
//	}

	public Alunos(String nome, String cpf, int matricula, String vertente) {
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
		this.vertente = vertente;
	}

	
	/*
Cize Lucas;184.047.483-00;478242;Computacao
Vitinho;534.892.954-30;540852;Medicina
Fischer Peixer;487.358.492-01;978435;Musica
	*/
	
	
	
	
	public boolean equals(Object obj) {
		Alunos alunoTemp = (Alunos) obj;
		return ((this.matricula == alunoTemp.getMatricula()) && (this.cpf.equals(alunoTemp.getCpf())));
	}
	
//	public void criarNovoAluno(String nome, String cpf, String matricula, String vertente) {
//		
//		Alunos alunoTemp = new Alunos(nome, cpf, this.parseIntMatricula(matricula), vertente);
//		
//		if(!arrayDeAlunos.contains(alunoTemp)) {
//			arrayDeAlunos.add(alunoTemp);
//		}
//		
//		this.salvarAlunos();
//	}
	
//	public void salvarAlunos() {
//		System.out.println("SALVARALUNOS");
//		for (Alunos aluno : arrayDeAlunos) {
//			escrita.salvarAluno(aluno);
//		}
//	}
//	
//	public String listarAlunos() {
//		return "";
//	}
	
//	public void atualizarAluno(String matricula, String novaVertente) {
//		int intMatricula = this.parseIntMatricula(matricula);
//		
//		for (int i=0; i<arrayDeAlunos.size(); i++) 
//			if(arrayDeAlunos.get(i).getMatricula() == intMatricula) {
//				arrayDeAlunos.get(i).setVertente(novaVertente);
//				return ;
//			}
//		
//		
//	}
	
//	public void deletarAluno(String matricula) {
//		int intMatricula = this.parseIntMatricula(matricula);
//		
//		for (int i=0; i<arrayDeAlunos.size(); i++) 
//			if(arrayDeAlunos.get(i).getMatricula() == intMatricula) {
//				arrayDeAlunos.remove(i);
//				return ;
//			}
//		
//	}
	
//	private int parseIntMatricula(String strMatricula) {
//		try {
//			return Integer.parseInt(strMatricula);
//		}catch (Exception e) {
//			System.out.println("parseInt deu ruim :(");
//			return -1;
//		}
//	}
	
//	public void printarAlunos() {
//		for (Alunos aluno : arrayDeAlunos) {
//			System.out.println(aluno.getNome()+" "+aluno.getCpf()+" "+aluno.getMatricula()+" "+aluno.getVertente());
//		}
//		if(arrayDeAlunos.size()==0) {
//			System.out.println("arrayDeAlunos vazio");
//		}
//	
//	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getVertente() {
		return vertente;
	}

	public void setVertente(String vertente) {
		this.vertente = vertente;
	}
	
	
	
	
	
	
}
