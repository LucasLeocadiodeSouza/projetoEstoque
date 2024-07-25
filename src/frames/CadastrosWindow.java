package frames;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class CadastrosWindow {
	
	JFrame cadastrosWindow;
	JButton produtos;
	JButton pFarmaceuticos;
	
	public CadastrosWindow(Point locCadastro, JButton butao) {
		
		int locHeight =  butao.getHeight();
		
		pFarmaceuticos = new JButton("Prod. Farmarceuticos");
		pFarmaceuticos.setVisible(true);
		pFarmaceuticos.setFocusable(false);
		pFarmaceuticos.setBackground(null);
		pFarmaceuticos.setPreferredSize(new Dimension(200,50));
		pFarmaceuticos.setHorizontalAlignment(SwingConstants.LEFT);
		
		produtos = new JButton("Produtos");
		produtos.setVisible(true);
		produtos.setFocusable(false);
		produtos.setBackground(null);
		produtos.setPreferredSize(new Dimension(200,50));
		produtos.setHorizontalAlignment(SwingConstants.LEFT);
		
		cadastrosWindow = new JFrame();
		cadastrosWindow.setSize(200,700);
		cadastrosWindow.setResizable(false);
		cadastrosWindow.setUndecorated(true);
		cadastrosWindow.getContentPane().setBackground(Color.LIGHT_GRAY);
		cadastrosWindow.setLocation(locCadastro.x, locCadastro.y + locHeight - 3);
		
		JPanel painelBotao = new JPanel();
		painelBotao.setLayout(new BoxLayout(painelBotao, BoxLayout.Y_AXIS));
		painelBotao.setBackground(Color.LIGHT_GRAY);
		
		painelBotao.add(produtos);
		painelBotao.add(pFarmaceuticos);
		painelBotao.setVisible(true);
		
		cadastrosWindow.add(painelBotao);
		cadastrosWindow.setVisible(true);
		
		
		
	}
	
}
