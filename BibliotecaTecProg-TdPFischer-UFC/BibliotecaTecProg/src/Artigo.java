
public class Artigo extends Publicacoes{

	public Artigo(int id, String titulo, String autor, String anoPublicacao, int quantidade) {
		super(id, titulo, autor, anoPublicacao, quantidade);
		tipo = "Artigo";
	}

}
