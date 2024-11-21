
public abstract class Publicacoes {

	public int id;
	public String tipo;
	public String titulo;
	public String autor;
	public String anoPublicacao;
	public int qtdDisponivel;
	public int qtdAlugada;
	
	
	public Publicacoes(int id, String titulo, String autor, String anoPublicacao, int quantidade) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.qtdDisponivel = quantidade;
		qtdAlugada =0;
	}
	
	public boolean atingiuLimDeUnidades() {
		if(qtdAlugada+1<=qtdDisponivel) // 	5+1 < 5			3+1 < 5
			return false;
		else
			return true;
	}
	
}