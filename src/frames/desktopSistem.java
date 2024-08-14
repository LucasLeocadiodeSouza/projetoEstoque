package frames;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class desktopSistem implements ActionListener{
	JFrame frame;
	JButton almoxarifado;
	JButton farmacia;
	JButton fechar;
	
	public desktopSistem()
	{
		frame = new JFrame();
		frame.setTitle("Desktop Portifolio");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(200,500);
		frame.setResizable(false);
		frame.setUndecorated(true);
		frame.setLayout(new BorderLayout());
		frame.setLocationRelativeTo(null);
		 // Obtém o tamanho da tela
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        // Calcula a posição para o canto inferior direito
        int x = screenSize.width - frame.getWidth();
        int y = screenSize.height - frame.getHeight();
        // Define a posição da janela no canto inferior direito
        frame.setLocation(x, y);
		
        
		JLabel title = new JLabel(" Desktop Sistema");
		title.setForeground(Color.white);
		

		JPanel titleBar = new JPanel();
		titleBar.setLayout(new BorderLayout());
		titleBar.setBackground(Color.BLUE);
		titleBar.add(title);	
		
		almoxarifado = new JButton("Almoxarifado");
		almoxarifado.setFocusable(false);
		almoxarifado.setBackground(null);
		almoxarifado.addActionListener(this);
		
		farmacia = new JButton("Farmacia");
		farmacia.setFocusable(false);
		farmacia.setBackground(null);
		farmacia.addActionListener(this);
		
		fechar = new JButton("Fechar desktop");
		fechar.setFocusable(false);
		fechar.setBackground(null);
		fechar.addActionListener(this);
		
		JPanel secoes = new JPanel();
		secoes.setLayout(null);
		
		JPanel subSecoes = new JPanel();
		subSecoes.setBounds(0, 0, 200, 100);
		subSecoes.setLayout(new GridLayout(3,1));
		subSecoes.setBackground(Color.LIGHT_GRAY);
		subSecoes.add(almoxarifado);
		subSecoes.add(farmacia);
		subSecoes.add(fechar);
		secoes.add(subSecoes);
		
		
		frame.add(titleBar, BorderLayout.NORTH);
		frame.add(secoes,  BorderLayout.CENTER);
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == fechar) {
			frame.dispose();
		}else if(e.getSource() == almoxarifado){
			almoWindow almoxarifado = new almoWindow();
		}else if(e.getSource() == farmacia) {
			//frame para cadastro  e  estoque de medicamentos
			farmWindow farmacia = new farmWindow();
		}
	}
	
}

