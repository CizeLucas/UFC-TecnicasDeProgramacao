
public class Servidor extends Clientes{

	private static int custoTPs = 15;
	
	public Servidor(String nome, int matricula) {
		super(nome, matricula);
		diasParaDevolver=15;
		cargo = "Servidor";
	}

	@Override
	public boolean atingiuLimiteEmp() {
		if(qtdPublicAlugadas+1<=7)
			return false;
		else
			return true;
	}

	@Override
	public boolean atingiuLimiteTps(Publicacoes publicacao, boolean usuarioDoouLivros) {
		if((this.Tps+custoTPs)%50==0 && Tps !=0)
			return true;
		else
			return false;
	}

	@Override
	public void atualizarTPs(Publicacoes publicacao) {
		this.Tps += custoTPs;
	}
	
	

}
