import java.util.ArrayList;

public class Biblioteca {

	private ArrayList<Emprestimos> emprestimos;
	private ArrayList<Clientes> clientes;
	private ArrayList<Publicacoes> publicacoes;
	
	public Biblioteca() {
		emprestimos = new ArrayList<Emprestimos>();
		clientes = new ArrayList<Clientes>();
		publicacoes = new ArrayList<Publicacoes>();
	}
	
	public void cadastrarCliente(Clientes cliente) {
		if(!clientes.contains(cliente)) 
			clientes.add(cliente);
	}
	
	
	public void emprestar(Clientes cliente, Publicacoes publicacao) {
		
		Emprestimos emprestimoTemp = new Emprestimos(cliente, publicacao);
		if(this.checarSeClienteTemPublicacao(cliente, publicacao)) {
			System.out.printf("%s, Voce ja tem essa publicacao alugada.\n", cliente.nome);
		} else {
			if(emprestimoTemp.checarSeEmprestimoValido(cliente, publicacao)) {
				emprestimos.add(emprestimoTemp);
				emprestimoTemp.atualizarVariaveis(cliente, publicacao, true);
				this.cadastrarCliente(cliente);
				System.out.printf("%s pegou emprestado o %s '%s' e tem %d dias para devolve-lo.\n", cliente.nome, publicacao.tipo, publicacao.titulo, cliente.diasParaDevolver);
			} else {
				System.out.println(emprestimoTemp.fraseDeErro(cliente, publicacao));
				
				if(emprestimoTemp.checarLimiteTPsCliente(cliente, publicacao)) {
					System.out.println("Voce escolheu (>por livre e espontanea pressao<) doar um livro a biblioteca e seu limite de TPs foi renovado!");
					System.out.printf("%s pegou emprestado o livro '%s' e tem %d dias para devolve-lo.\n", cliente.nome, publicacao.titulo, cliente.diasParaDevolver);
					emprestimos.add(emprestimoTemp);
					emprestimoTemp.atualizarVariaveis(cliente, publicacao, true);
					//essa forma de resolver os problemas com TPs nao eh 100% correta mas o importante eh aprender O.O. nao eh mesmo? kkkkkk
				}
				
			}
		}
	}

	
	public void devolver(Clientes cliente, Publicacoes publicacao) {
		Emprestimos emprestimoTemp = new Emprestimos(cliente, publicacao);
		
		if(this.checarSeClienteTemPublicacao(cliente, publicacao)){
			System.out.printf("%s devolveu o livro '%s', Obrigado!\n", cliente.nome, publicacao.titulo, cliente.diasParaDevolver);
			emprestimos.remove(emprestimoTemp);
			emprestimoTemp.atualizarVariaveis(cliente, publicacao, false);
		} else {
			System.out.printf("%s nao tem a publicacao '%s' para devolver.\n", cliente.nome, publicacao.titulo);
		}
	}

	
	public void verClientes() {
		int contador=1;
		System.out.println("Lista de Clientes:");
		System.out.println("       Cargo - Matricula -  Nome - TPs");
		for (Clientes cliente : clientes) {
			System.out.println("   "+contador +")  "+ cliente.cargo +" - "+cliente.matricula +" - "+ cliente.nome +" - "+ cliente.Tps);
			contador++;
		}
	}
	
	
	
	public void buscarPublicacao(String titulo) {
		boolean encontrouPublicacao = false;
		String textoDeSaida="";
		for(Emprestimos emprestimo : emprestimos) {
			
			if((emprestimo.getPublicacao().titulo).equals(titulo)) {
				textoDeSaida = String.format("Publicacao do tipo '"+emprestimo.getPublicacao().tipo+"' Encontrada:\n   "
			+emprestimo.getPublicacao().titulo+" - Autor: "+emprestimo.getPublicacao().autor+" - Ano De Publicacao: "+emprestimo.getPublicacao().anoPublicacao);
				encontrouPublicacao = true;
			}
		}
		System.out.println(textoDeSaida);
		if(!encontrouPublicacao) 
			System.out.println("Nenhuma publicacao com o titulo '"+titulo+"' foi encontrada");
		
	}
	
	
	public void consultarCliente (int matricula) {
		boolean temLivros=false;
		boolean clienteExiste=false;
		int contador = 1;
		String nomeClienteTemp="";
		
		for(Clientes cliente : clientes) {
			if(cliente.matricula == matricula) {
				nomeClienteTemp=cliente.nome;
				clienteExiste = true;
			}
				
		}
		
		if(!clienteExiste){
			System.out.println("O cliente com a matricula '"+matricula+"' nao existe!");
		} else {
			
			System.out.printf("O cliente %s, com matricula %d tem emprestado: \n", nomeClienteTemp, matricula);
			for (Emprestimos emprestimo : emprestimos) {
				if(emprestimo.getCliente().matricula == matricula) {
					temLivros=true;
					System.out.println("   "+contador+")   "+emprestimo.getPublicacao().titulo);		
					contador++;
				}
			}
			if(!temLivros) 
				System.out.println("   Nenhum livro.");
		
		}
	}

	
	public boolean checarSeClienteTemPublicacao(Clientes cliente, Publicacoes publicacao) {
		Emprestimos emprestimoTemp = new Emprestimos(cliente, publicacao);
		return emprestimos.contains(emprestimoTemp);
	}
	
	
	public void adicionarPublicacao(Publicacoes publicacao) {
		publicacoes.add(publicacao);
	}
	
	
	public void removerPublicacao(Publicacoes publicacao) {
		publicacoes.remove(publicacao);
	}
	
	
	public void listarPublicacoes() {
		int contador=1;
		System.out.println("O acervo da biblioteca eh:\n       Tipo    -      Titulo     -   Autor   -   Ano   -   Qtd de Exemplares");
		for(Publicacoes publicacao : publicacoes) {
			System.out.printf("   %d) %s  -  %s  -  %s  -  %s  -  %d\n", contador, publicacao.tipo, publicacao.titulo, publicacao.autor, publicacao.anoPublicacao, publicacao.qtdDisponivel);
			contador++;
		}
	}
	
	
}
