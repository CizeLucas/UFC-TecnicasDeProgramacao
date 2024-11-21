package negocio;

import java.util.Random;

import apresentacao.*;

public class Jogo {

	private Jogador jogador;
	private Tela tela;
	private Terminal terminal;
	private int numeroEscolhido;
	private boolean jogando;
	private int numAleatorioMaximo;

	public Jogo() {
		tela = new Tela();
		terminal = new Terminal();
		jogador = new Jogador();
		jogando = true;
		numAleatorioMaximo = 100; // configure aqui o maior numero aleatorio a ser gerado
		numeroEscolhido = sortearNumeroAleatorio();
	}

	public int sortearNumeroAleatorio() {
		Random geradorAleatorio = new Random();
		return geradorAleatorio.nextInt(numAleatorioMaximo);
	}
	
	public void inciarJogoTerminal() {
		jogador.setNome(terminal.entradaNome());
		terminal.mesagem("Seja bem vindo: " + jogador.getNome());
	}

	public void inciarJogoGUI() {
		tela.mensagem("Olá Jogador! Essa obra prima da programacao Orientada A Objetos em Java vai lhe\n" +
				"trazer o incrivel desafio gamer de encotrar um numero inteiro de 0 a "+numAleatorioMaximo+ ".\n VAMOS LA??");
		jogador.setNome(tela.entradaDados("Qual eh o seu nome?"));
		tela.mensagem("Seja bem vindo: " + jogador.getNome());
		verificarAcerto();
	}

	public int solicitarNumero() {
		int numero;
		try {
			numero = Integer.parseInt(tela.entradaDados("Informe um numero:"));
		} catch (NumberFormatException naoEhNumero) {
			tela.mensagem("Este campo nao pode ser nulo e recebe apenas numeros. Preencha-o corretamente.");
			solicitarNumero();
			return 0;
		}
		return numero;
	}

	private void imprimirTodasTentativas(String msg) {
		String numeros="";
		for (Integer numero : jogador.getListaNumeros())
			numeros += numero + " - ";
		
		tela.mensagem(msg + "\nForam feitas "+ jogador.getNumeroTentativa() 
		+" Tentativa(s) para acertar o numero sorteado\n ("+ numeros +")");
	}

	public String verificarNumero(int numero) {
		if (numero < numeroEscolhido)
			return "O numero em que voce apostou eh MENOR do que o sorteado";

		return "O numero em que voce apostou eh MAIOR do que o sorteado";
	}

	
	public void verificarAcerto() {
		do {
			int numero = solicitarNumero();
			jogador.addNumero(numero);
			if (numero == numeroEscolhido) {
				imprimirTodasTentativas("Fim De Jogo!!!  Voce Acertou!!!  [ ;) ]");
				jogando = false;
			} else {
				jogador.setNumeroTentativa();
				imprimirTodasTentativas("Voce Errou!!!   "+ verificarNumero(numero) +"\n");
			}
		}while(jogando);
	}

}
