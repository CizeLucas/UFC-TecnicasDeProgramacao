package interfaceGrafica;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.*;
@SuppressWarnings("serial")
public class painelDeAtualizar extends Paineis{
	
	DadosAlunos alunos;
	JTextField jtfMatricula;
	JTextField jtfVertente;
	
	public painelDeAtualizar(DadosAlunos alunos) {
		this.alunos = alunos;
		this.setLayout(new GridLayout(3,1));

		JPanel jp1 = criarJPanel(corPadraoJPanel);
		jp1.add(criarJLabel("Matricula:", corPadraoJLabel));
		jtfMatricula = criarJTextField();
		jp1.add(jtfMatricula);
		this.add(jp1);
		
		
		JPanel jp2 = criarJPanel(corPadraoJPanel);
		jp2.add(criarJLabel("Vertente:", corPadraoJLabel));
		jtfVertente = criarJTextField();
		jp2.add(jtfVertente);
		this.add(jp2);
		
		
		JPanel jp3 =  criarJPanel(corPadraoJPanel);
		JButton botaoAtualizar = criarJButton("Atualizar", corPadraoJButton);
		botaoAtualizar.addActionListener(new atualizarAluno());
		jp3.add(botaoAtualizar);
		this.add(jp3);
		
		this.setBackground(new Color(201, 218, 248));
		this.setVisible(false);
	}
	
	private class atualizarAluno implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			alunos.atualizarAluno(jtfMatricula.getText(), jtfVertente.getText());
			alunos.printarAlunos();
			
			jtfMatricula.setText("");
			jtfVertente.setText("");
		}
		
	}
	
}
