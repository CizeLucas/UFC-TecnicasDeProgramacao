package interfaceGrafica;

import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controller.*;
@SuppressWarnings("serial")
public class painelDeListar extends Paineis{

	DadosAlunos alunos;
	ArrayList<Alunos> arrayAlunosTemp;
	DefaultTableModel modeloRowTabela;
	
	public painelDeListar(DadosAlunos alunos) {
		this.alunos = alunos;
		
		// ainda não consegui fazer funcionar o JTable :(
		
		JPanel jp = criarJPanel(corPadraoJPanel, 1);
		jp.add(criarJTextField("ainda não consegui fazer funcionar o JTable :("));
		this.add(jp);
		
		arrayAlunosTemp = alunos.getArrayList();
		this.setVisible(false);
	}
	
	public void listarAlunos() {
		modeloRowTabela = new DefaultTableModel();
		
		Object[] colunas = {"Nome", "CPF", "Matricula", "Vertente"};
		modeloRowTabela.addRow(colunas);
		
		int contador=0;
		for (Alunos aluno : arrayAlunosTemp) {
			Object[] dados =  {aluno.getNome(), aluno.getCpf(), aluno.getMatricula(), aluno.getVertente()};
			modeloRowTabela.addRow(dados);
			contador++;
			}
		
		JTable jt = criarJTable(modeloRowTabela);
		jt.setVisible(true);
		
		this.add(jt);
		
		
	}
	
}
