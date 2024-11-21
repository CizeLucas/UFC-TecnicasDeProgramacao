
public class Revista extends Publicacoes{

	public Revista(int id, String titulo, String autor, String anoPublicacao, int quantidade) {
		super(id, titulo, autor, anoPublicacao, quantidade);
		tipo = "Revista";
	}

}
