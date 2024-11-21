package interfaceGrafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.*;

@SuppressWarnings("serial")
public class painelDeCadastro extends Paineis {
	
	DadosAlunos alunos;
	JTextField jtfNome;
	JTextField jtfCpf;
	JTextField jtfMatricula;
	JTextField jtfVertente;
	JButton botaoCadastrar;
	
	public painelDeCadastro(DadosAlunos alunos) {
		this.alunos = alunos;
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		
		JPanel painel1 = criarJPanel(corPadraoJPanel);
		painel1.add(criarJLabel("Nome:", corPadraoJLabel));
		jtfNome = criarJTextField();
		jtfNome.setText("Cize Lucas");
		painel1.add(jtfNome);
		this.add(painel1);
		
		JPanel painel2 = criarJPanel(corPadraoJPanel);
		painel2.add(criarJLabel("CPF:", corPadraoJLabel));
		jtfCpf = criarJTextField();
		jtfCpf.setText("184.047.483-00");
		painel2.add(jtfCpf);
		this.add(painel2);
		
		JPanel painel3 = criarJPanel(corPadraoJPanel);
		painel3.add(criarJLabel("Matricula:", corPadraoJLabel));
		jtfMatricula = criarJTextField();
		jtfMatricula.setText("478242");
		painel3.add(jtfMatricula);
		this.add(painel3);
		
		JPanel painel4 = criarJPanel(corPadraoJPanel);
		painel4.add(criarJLabel("Vertente:", corPadraoJLabel));
		jtfVertente = criarJTextField();
		jtfVertente.setText("Computacao");
		painel4.add(jtfVertente);
		this.add(painel4);
		
		JPanel painel5 = criarJPanel(corPadraoJPanel);
		botaoCadastrar = criarJButton("Cadastrar", corPadraoJButton);
		botaoCadastrar.addActionListener(new cadastrarAluno());
		painel5.add(botaoCadastrar);
		this.add(painel5);
		
		this.setVisible(false);
	}

	private class cadastrarAluno implements ActionListener {

		
		public void actionPerformed(ActionEvent e) {
			alunos.criarNovoAluno(jtfNome.getText(), jtfCpf.getText(), jtfMatricula.getText(), jtfVertente.getText());
			alunos.printarAlunos();
			
			jtfNome.setText("");
			jtfCpf.setText("");
			jtfMatricula.setText("");
			jtfVertente.setText("");
		}
		
	}
	
	
	
	
}
