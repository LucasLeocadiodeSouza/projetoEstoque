package frames;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import Diu.frameDiuCadas;
import Diu.frameEstoqueDiu;
import farmacia.frameMedCadas;

	
	public class farmWindow implements ActionListener{
	
		JPanel subBarra;
		JPanel barra;
		JLabel IconEmp;
		JMenuItem cadastrarDiu;
		JMenuItem cadastrarMed;
		JMenuItem inventario;
		JMenuItem estoqueDiu;
		JMenuItem estoqueMed;
		JMenuItem consultas;
		private int alturaSubBarra = 27;
		
		
		
		public farmWindow(){
			
			ImageIcon imagemOriginal = new ImageIcon("C://Users//vanil//Downloads//IconWindows-removebg-preview.png//");
			
			Image imagemModificar = imagemOriginal.getImage();
			Image imagem = imagemModificar.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
			ImageIcon imagemIcon = new ImageIcon(imagem);
			
			IconEmp = new JLabel(); 
			IconEmp.setIcon(imagemIcon);
			IconEmp.setBounds(10, 10, imagemIcon.getIconWidth(), imagemIcon.getIconHeight());
			IconEmp.setVisible(true);
			
			
			
			JFrame home = new JFrame();
			home.setTitle("Sistemas * Farmacia");
			home.setSize(1000,700);
			home.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			home.setLayout(null);
			home.getContentPane().setBackground(Color.blue);
			
			
			
			// criando uma subBarra para colocar o menu bar
			subBarra = new JPanel();
			subBarra.setBackground(Color.GRAY);
			subBarra.setLayout(new BorderLayout());
			
			
			
			
			
			//criando e definindo redeas para a barra de menu
			JMenuBar barraDeMenu = new JMenuBar();
			barraDeMenu.setOpaque(false);
			barraDeMenu.setBackground(new Color(0,0,0,0));
			JMenu mCadastro = new JMenu("Cadastros");
			JMenu mMovimentacao = new JMenu("Movimentações");
			JMenu mEntradas = new JMenu("Entradas");
			JMenu mKardex = new JMenu("Relatorios");
			JMenu mConsulta = new JMenu("Consultas");
			cadastrarDiu = new JMenuItem("Cadastrar Diu");
			cadastrarMed = new JMenuItem("Cadastrar Medicamentos");
			
			
			inventario = new JMenuItem("Inventario");
			estoqueDiu = new JMenuItem("Estoque Diu");
			estoqueMed = new JMenuItem("Estoque Medicamentos");
			consultas = new JMenuItem("Agendamento de Diu");
			
			
			//adicionar acao
			cadastrarDiu.addActionListener(this);
			cadastrarMed.addActionListener(this);
			estoqueDiu.addActionListener(this);
			
			
			
			mCadastro.add(cadastrarDiu);
			mCadastro.add(cadastrarMed);
			mMovimentacao.add(inventario);
			mMovimentacao.add(estoqueDiu);
			mMovimentacao.add(estoqueMed);
			mConsulta.add(consultas);
			barraDeMenu.add(mCadastro);
			barraDeMenu.add(mMovimentacao);
			barraDeMenu.add(mEntradas);
			barraDeMenu.add(mConsulta);
			barraDeMenu.add(mKardex);
			subBarra.add(barraDeMenu, BorderLayout.WEST);
			
			
			
			
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
	        
	        // Atualiza e repinta os painéis para refletir as mudanças de tamanho.
	        barra.revalidate();
	        barra.repaint();
	        subBarra.revalidate();
	        subBarra.repaint();
	      
	        
	        
	        
		}
		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==cadastrarDiu) {
				frameDiuCadas framediucadas = new frameDiuCadas("Cadastro de Diu");
			}else if(e.getSource()==cadastrarMed) {
				frameMedCadas framematcadas = new frameMedCadas();
			}
			
			
			
			if(e.getSource()==estoqueDiu) {
				frameEstoqueDiu frameestoquediu = new frameEstoqueDiu();
			}
		}
		
}