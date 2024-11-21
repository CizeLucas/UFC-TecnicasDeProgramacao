
public class Emprestimos {

	private Clientes cliente;
	private Publicacoes publicacao;
	
	public Emprestimos(Clientes cliente, Publicacoes publicacao) {
		this.cliente = cliente;
		this.publicacao = publicacao;
	}
	
	public boolean checarSeEmprestimoValido(Clientes cliente, Publicacoes publicacao) {
		if(!publicacao.atingiuLimDeUnidades()) {	
			if( (!cliente.atingiuLimiteEmp()) && (!cliente.atingiuLimiteTps(publicacao, false) /*&& (se cliente ja tem o livro)*/)) {
				return true;
			}
		}	
		
		return false;
	}
	
//	public void doarLivro(Clientes cliente) {
//		cliente.;
//	}
	
	public String fraseDeErro(Clientes cliente, Publicacoes publicacao) {
		if(publicacao.atingiuLimDeUnidades()) {
			return String.format("As unidades da publicacao '"+ publicacao.titulo+"' acabaram." );
			} else {
				
				if(cliente.atingiuLimiteEmp()) {
					return String.format(cliente.nome+", Voce atingiu seu limite de publicacoes emprestadas." );
				} else {
					if(cliente.atingiuLimiteTps(publicacao, false)) {
						return String.format(cliente.nome+", Voce atingiu seu limite de TPS, doe um livro a biblioteca para resolver esse problema." );
					}	
				}		
		}
		return null;
	}
	
	public void atualizarVariaveis(Clientes Cliente, Publicacoes publicacao, boolean isEmprestimo) {
		if(isEmprestimo) {
			publicacao.qtdAlugada++;
			Cliente.qtdPublicAlugadas++;
		} else {
			publicacao.qtdAlugada--;
			Cliente.qtdPublicAlugadas--;
		}
		
		Cliente.atualizarTPs(publicacao);
	}
	
	public boolean checarLimiteTPsCliente(Clientes cliente, Publicacoes publicacao) {
		return cliente.atingiuLimiteTps(publicacao, false);
	}
	
	
	//sobreescrevento metodo .equals() do pai Object
//	public boolean equals(Object obj) {
//		Emprestimos emp = (Emprestimos) obj;
//		return ( this.cliente.nome.equals(emp.cliente.nome) && 
//				this.publicacao.titulo.equals(emp.publicacao.titulo) &&
//				this.publicacao.id == emp.publicacao.id);
//	}

	public Clientes getCliente() {
		return cliente;
	}

	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}

	public Publicacoes getPublicacao() {
		return publicacao;
	}

	public void setPublicacao(Publicacoes publicacao) {
		this.publicacao = publicacao;
	}

	
	
}
