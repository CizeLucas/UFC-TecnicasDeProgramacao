
public class Aluno extends Clientes{

	private static int custoTPs = 20;
	
	public Aluno(String nome, int matricula) {
		super(nome, matricula);
		//Tps = 41;
		qtdPublicAlugadas=0;
		diasParaDevolver = 10;
		cargo = "Aluno";
	}
	
	
	@Override
	public boolean atingiuLimiteEmp() {
		if(qtdPublicAlugadas+1<=5)
			return false;
		else
			return true;
	}
	
	@Override
	public boolean atingiuLimiteTps(Publicacoes publicacao, boolean usuarioDoouLivros) {
		if(usuarioDoouLivros) {
			return true;
		} else {
			//(10*((int)Tps/10)) -> arredonda para baixo para a dezena fechada
			if( Tps !=0 && (10*((int)Tps/10))%50==0)
				return true;
			else
				return false;
		}
	}
	
	public void atualizarTPs(Publicacoes publicacao) {
		if(publicacao instanceof Livro) {
			this.Tps += (int) (custoTPs*0.9);
		} else if(publicacao instanceof Artigo) {
			this.Tps += (int) (custoTPs*0.5);
			} else {
				this.Tps += (int) (custoTPs*0.01);
			}
	}
	
	
//	@Override
//	public boolean atingiuLimiteTps(Publicacoes publicacao) {
//		int custoTps=0;
//		if(publicacao instanceof Livro) {
//			custoTps = (int) (10*0.9);
//		} else if(publicacao instanceof Artigo) {
//			custoTps = (int) (10*0.5); 
//			} else {
//				custoTps = (int) (10*0.01);
//			}
//		
//		if((this.Tps+custoTps)%50==0 && Tps !=0)
//			return true;
//		else
//			return false;
//	}
	
	


}
