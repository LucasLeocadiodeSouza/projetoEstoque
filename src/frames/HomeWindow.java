package frames;

	import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

	
	public class HomeWindow implements ActionListener{
	
		JPanel subBarra;
		JPanel barra;
		JButton cadastros;
		JLabel IconEmp;
		private int alturaSubBarra = 27;
		
		
		public HomeWindow(){
			
			ImageIcon imagemOriginal = new ImageIcon("C://Users//vanil//Downloads//IconWindows-removebg-preview.png//");
			
			Image imagemModificar = imagemOriginal.getImage();
			Image imagem = imagemModificar.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
			ImageIcon imagemIcon = new ImageIcon(imagem);
			
			IconEmp = new JLabel(); 
			IconEmp.setIcon(imagemIcon);
			IconEmp.setBounds(10, 10, imagemIcon.getIconWidth(), imagemIcon.getIconHeight());
			IconEmp.setVisible(true);
			
			JFrame home = new JFrame();
			home.setTitle("Prexeco");
			home.setSize(1000,700);
			home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			home.setLayout(null);
			
			cadastros = new JButton("cadastros");
			cadastros.addActionListener(this);
			cadastros.setLayout(null);
			cadastros.setFocusable(false);
			cadastros.setBackground(null);
			cadastros.setBorder(null);
			
			
			subBarra = new JPanel();
			subBarra.setBackground(Color.LIGHT_GRAY);
			subBarra.add(cadastros);
			subBarra.setLayout(null);
			
			barra = new JPanel();
			barra.setBackground(Color.LIGHT_GRAY);
			barra.setLayout(null);
			barra.add(subBarra);
			barra.add(IconEmp);
			
			home.add(barra);
			
			home.addComponentListener(new ComponentAdapter(){
				public void componentResized(ComponentEvent e) {
					adjustPanelSizes(home);
				}
			});
			
			adjustPanelSizes(home);
			
			home.setVisible(true);
	}
		
		public void adjustPanelSizes(JFrame home) {
			int largura = home.getWidth();
	        
	        barra.setBounds(0, 0, largura, 100);
	        subBarra.setBounds(0, barra.getHeight() - alturaSubBarra, largura, alturaSubBarra);
	        
	        cadastros.setBounds(0,0,70,30);
	        
	        // Atualiza e repinta os painéis para refletir as mudanças de tamanho.
	        barra.revalidate();
	        barra.repaint();
	        subBarra.revalidate();
	        subBarra.repaint();
	      
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			CadastrosWindow cadastros = new CadastrosWindow();
		}
}

	
	
	
	
	
	
	
	
	
