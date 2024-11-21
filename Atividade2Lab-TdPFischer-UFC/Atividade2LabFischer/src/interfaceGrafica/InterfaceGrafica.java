package interfaceGrafica;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

import controller.*;

@SuppressWarnings("serial")
public class InterfaceGrafica extends JFrame {
	
	JPanel painel1;
	ArrayList<JPanel> JPanels;
	DadosAlunos alunos;
	
public InterfaceGrafica(DadosAlunos alunos) {
		this.alunos = alunos;
		ImageIcon image = new ImageIcon("ThumbsupSmiley.png");
		
		JPanels = new ArrayList<JPanel>();
		JPanel painelDeCadastro;
		JPanel painelDeListar;
		JPanel painelDeAtualizar;
		JPanel painelDeDeletar;
		
		painelDeCadastro = new painelDeCadastro(alunos).retornarPainel();
		JPanels.add(painelDeCadastro);
		
		painelDeListar = new painelDeListar(alunos).retornarPainel();
		JPanels.add(painelDeListar);
		
		painelDeAtualizar = new painelDeAtualizar(alunos).retornarPainel();
		JPanels.add(painelDeAtualizar);
		
		painelDeDeletar = new painelDeDeletar(alunos).retornarPainel();
		JPanels.add(painelDeDeletar);
		
		this.setSize(500, 500);
		this.setTitle("Sistema");
		this.setIconImage(image.getImage());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBackground(Color.BLACK);
		this.setLayout(new BorderLayout());
		
		
		painel1 = criarJPanel(Color.WHITE);
		JButton botao;
		
		botao = criarJButton("Cadastrar", true);
		botao.addActionListener(new botaoApertado(0));
		painel1.add(botao);
		
		botao = criarJButton("Listar", true);
		botao.addActionListener(new botaoApertado(1));
		painel1.add(botao);
		
		botao = criarJButton("Atualizar", true);
		botao.addActionListener(new botaoApertado(2));
		painel1.add(botao);
		
		botao = criarJButton("Deletar", true);
		botao.addActionListener(new botaoApertado(3));
		painel1.add(botao);
		
		painel1.setBackground(new Color(201, 218, 248));
		painel1.setBorder(BorderFactory.createLineBorder(Color.WHITE,3));
		
		this.add(painel1, BorderLayout.NORTH);
		
		this.setVisible(true);
	}
	
	public JPanel criarJPanel(Color c) {
		JPanel p = new JPanel();
		p.setBackground(c);
		return p;
	}
	
	public JButton criarJButton(String msg, boolean aplicarCor) {
		JButton b = new JButton(msg);	
		if(aplicarCor) {
			b.setBackground(new Color(217, 234, 211));
		}
		return b;
	}
	
	public void seletorDeJPanel(int seletor) {
		for(int i=0; i<JPanels.size(); i++) {
			if(i==seletor) {
				if (JPanels.get(seletor).isVisible()) {
					JPanels.get(seletor).setVisible(false);
				} else {
					JPanels.get(seletor).setVisible(true);
				}
			} else {
				JPanels.get(i).setVisible(false);
			}
		}
		
		this.add(JPanels.get(seletor));
		this.revalidate();
		this.repaint();
	}
	
	
	private class botaoApertado implements ActionListener {
		int seletorDePainel;
		
		public botaoApertado(int seletorDePainel) {
			this.seletorDePainel = seletorDePainel;	
		}
		
		public void actionPerformed(ActionEvent e) {
			seletorDeJPanel(seletorDePainel);	
		}
	}
	
}

