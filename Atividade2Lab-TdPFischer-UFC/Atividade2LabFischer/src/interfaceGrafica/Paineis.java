package interfaceGrafica;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class Paineis extends JPanel{
	
	Border borda;
	Color corPadraoJPanel;
	Color corPadraoJButton;
	Color corPadraoJButton2;
	Color corPadraoJTextField;
	Color corPadraoJLabel;
	
	public Paineis() {
		 borda = BorderFactory.createLineBorder(Color.WHITE,2);
		 corPadraoJPanel = new Color(201, 218, 248);
		 corPadraoJButton = new Color(109, 158, 235);
		 corPadraoJButton2 = new Color(217, 234, 211);
		 corPadraoJTextField = new Color(207, 226, 243);
		 corPadraoJLabel = new Color(207, 226, 243);;
	}
	
//	public Border criarBorda(Color cor, int grossuraDaBorda) {
//		return BorderFactory.createLineBorder(cor,grossuraDaBorda);
//	}
	
	public JTextField criarJTextField() {
		JTextField tf = new JTextField();
		tf.setPreferredSize(new Dimension(270, 50));
		tf.setFont(new Font("Arial", Font.BOLD, 16));
		tf.setBackground(corPadraoJTextField);
		return tf;
	}
	
	public JTable criarJTable(String colunas[], Object linhasDeDados[][]) {
		JTable jt = new JTable(linhasDeDados, colunas);
		return jt;
	}
	
	public JTable criarJTable(DefaultTableModel dtm) {
		JTable jt = new JTable(dtm);
		return jt;
	}
	
	public JTable criarJTable() {
		JTable jt = new JTable();
		return jt;
	}
	
	public JTextField criarJTextField(String msg) {
		JTextField tf = new JTextField();
		tf.setPreferredSize(new Dimension(270, 50));
		tf.setFont(new Font("Arial", Font.BOLD, 16));
		tf.setText(msg);
		
		return tf;
	}	
			
	
	public JLabel criarJLabel(String msg, Color cor) {
		JLabel jl = new JLabel(msg);
		jl.setBackground(cor);
		return jl;
	}
	
	public JPanel retornarPainel() {
		this.setBorder(borda);
		return this;
	}
	
	public JButton criarJButton(String msg, Color cor) {
		JButton jButton = new JButton(msg);
		jButton.setBackground(cor);
		return jButton;
	}
	
	public JPanel criarJPanel(Color cor) {
		JPanel jPanel = new JPanel();
		jPanel.setBackground(cor);
		return jPanel;
	}
	
	public JPanel criarJPanel(int grossuraDaBorda) {
		JPanel jPanel = new JPanel();
		jPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK,grossuraDaBorda));
		return jPanel;
	}
	
	public JPanel criarJPanel(Color cor, int grossuraDaBorda) {
		JPanel jPanel = new JPanel();
		jPanel.setBackground(cor);
		jPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK,grossuraDaBorda));
		return jPanel;
	}
	
	public JPanel criarJPanel() {
		return new JPanel();
	}
	
}
