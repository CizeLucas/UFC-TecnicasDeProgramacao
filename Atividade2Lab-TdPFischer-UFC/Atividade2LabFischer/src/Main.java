
import controller.*;
import interfaceGrafica.*;
import persistencia.*;

public class Main {

	public static void main(String[] args) {
		
		DadosAlunos aluno = new DadosAlunos();
		
		@SuppressWarnings("unused")
		InterfaceGrafica ig = new InterfaceGrafica(aluno);
		
		
		
	}

}
