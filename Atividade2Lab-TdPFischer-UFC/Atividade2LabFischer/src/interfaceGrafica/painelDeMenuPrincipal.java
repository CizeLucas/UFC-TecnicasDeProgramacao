package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class painelDeMenuPrincipal extends Paineis{

	public painelDeMenuPrincipal(){
		JPanel painel1 = criarJPanel(Color.white);
		
		JButton botao;
		
		botao = criarJButton("Cadastrar", corPadraoJPanel);
		botao.addActionListener(new botaoCadastrarApertado());
		painel1.add(botao);
		
		botao = criarJButton("Listar", corPadraoJPanel);
		botao.addActionListener(new botaoListarApertado());
		painel1.add(botao);
		
		botao = criarJButton("Atualizar", corPadraoJPanel);
		botao.addActionListener(new botaoAtualizarApertado());
		painel1.add(botao);
		
		botao = criarJButton("Deletar", corPadraoJPanel);
		botao.addActionListener(new botaoDeletarApertado());
		painel1.add(botao);
		
		painel1.setBackground(new Color(201, 218, 248));
		painel1.setBorder(BorderFactory.createLineBorder(Color.WHITE,2));
		
		add(painel1, BorderLayout.NORTH);
	}
	
	private class botaoCadastrarApertado implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//seletorDeJPanel(0); -> NAO CONSEGUI CHAMAR ESSE METODO DA CLASSE InterfaceGrafica
		}
	}
	
	private class botaoListarApertado implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				//seletorDeJPanel(1); -> NAO CONSEGUI CHAMAR ESSE METODO DA CLASSE InterfaceGrafica
			}
	}
	
	private class botaoAtualizarApertado implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//seletorDeJPanel(2); -> NAO CONSEGUI CHAMAR ESSE METODO DA CLASSE InterfaceGrafica
		}
	}
	
	private class botaoDeletarApertado implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//seletorDeJPanel(3); -> NAO CONSEGUI CHAMAR ESSE METODO DA CLASSE InterfaceGrafica
		}
	}
	
}
