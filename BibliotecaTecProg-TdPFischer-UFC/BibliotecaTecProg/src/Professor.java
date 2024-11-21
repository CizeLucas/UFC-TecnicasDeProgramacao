
public class Professor extends Clientes{

	private static int custoTPs = 25;
	
	public Professor(String nome, int matricula) {
		super(nome, matricula);
		diasParaDevolver=20;
		cargo = "Professor";
	}

	@Override
	public boolean atingiuLimiteEmp() {
		if(qtdPublicAlugadas+1<=10)
			return false;
		else
			return true;
	}

	@Override
	public boolean atingiuLimiteTps(Publicacoes publicacao, boolean usuarioDoouLivros) {
		if(this.Tps%50==0 && Tps !=0)
			return true;
		else
			return false;
	}

	@Override
	public void atualizarTPs(Publicacoes publicacao) {
		this.Tps = this.Tps +  custoTPs;
	}

}
