
public abstract class Clientes {

	public String nome;
	public String cargo;
	public int matricula;
	public int Tps;
	public int qtdPublicAlugadas;
	public int diasParaDevolver;
	
	public Clientes(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
		Tps = 0;
		qtdPublicAlugadas = 0;
	}
	
	public abstract boolean atingiuLimiteEmp();

	public abstract boolean atingiuLimiteTps(Publicacoes publicacao, boolean usuarioDoouLivros);
	
	public abstract void atualizarTPs(Publicacoes publicacao);
	
//	public boolean equals(Object obj) {
//		Clientes clienteTemp = (Clientes) obj;
//		return ( this.nome.equals(clienteTemp.nome) && 
//				this.matricula == clienteTemp.matricula );
//	}
	
}