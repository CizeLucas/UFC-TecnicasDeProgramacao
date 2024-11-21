package interfaceGrafica;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.*;

@SuppressWarnings("serial")
public class painelDeDeletar extends Paineis {

	DadosAlunos alunos;
	JTextField jtfMatricula;
	
	public painelDeDeletar(DadosAlunos alunos) {
		this.alunos = alunos;
		
		this.setLayout(new GridLayout(2,2));

		JPanel jp1 = criarJPanel(corPadraoJPanel);
		jp1.add(criarJLabel("   Matricula: ", corPadraoJLabel));
		jtfMatricula = criarJTextField();
		jp1.add(jtfMatricula);
		this.add(jp1);
		
		JPanel jp2 = criarJPanel(corPadraoJPanel);
		JButton botaoDeletar = criarJButton("Deletar", corPadraoJButton);
		botaoDeletar.addActionListener(new deletarAluno());
		jp2.add(botaoDeletar);
		
		this.add(jp2);
		this.setVisible(false);	
	}
	
	private class deletarAluno implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			alunos.deletarAluno(jtfMatricula.getText());
			alunos.printarAlunos();
			
			jtfMatricula.setText("");
		}
		
	}
	
}
