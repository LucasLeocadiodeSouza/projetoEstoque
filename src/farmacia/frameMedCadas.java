package farmacia;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class frameMedCadas implements ActionListener{
	
	JFrame frame;
	JTextField usuarioTF;
	JFormattedTextField dataFTF;
	JTextField loteTF;
	JTextField validadeTF;
	JTextField marcaTF;
	JComboBox classCB;
	String[] vClassCB = {"Analgésico", "Anti-Inflamatorio", "Anti-Biotipo"}; //precisava criar uma classe para isso, com sua descricao, medicacao...
	JComboBox tipoCB;
	String[] vTipoCB = {"Similar","Referencia","Generico"}; //criar uma classe para tipos tambem
	JTextField obsTF;
	JComboBox fornecedorCB;
	String[] vFornecedorCB = {"Droga raia", "Drogaria Sao Paulo", "Hosp. Bom Samaritano", "Hosp. Rede Cross", "Hosp. Santa Rita"};
	JCheckBox estoqueChB;
	JCheckBox inventarioChB;
	JCheckBox devolucaoChB;
	JCheckBox emprestimoChB;
	JCheckBox reqSetorChB;
	JCheckBox reqPrestChB;
	JCheckBox prescChB;
	JButton cancelar;
	JButton cadastrar;
	
	
	public frameMedCadas(){
		
		frame = new JFrame("Cadastro de Materiais");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setForeground(Color.LIGHT_GRAY);
		frame.setResizable(false);
		frame.setSize(710,480);
		frame.setLayout(new GridLayout(4,1,0,0));
		frame.setLocationRelativeTo(null);
		
		
		JPanel divisao1 = new JPanel();
		JPanel subDivEsquerda = new JPanel();
		subDivEsquerda.setLayout(null);
		//subDivEsquerda.setBackground(Color.red);
		subDivEsquerda.setBackground(new Color(169,169,169));
		usuarioTF = new JTextField("@Usuario");
		JLabel usuarioL = new JLabel("Usuario: ");
		usuarioL.setBounds(45,18,100,27);
		usuarioTF.setBounds(100,18,150,27);
		usuarioTF.setFont(new Font("Arial", Font.PLAIN,14));
		usuarioTF.setBackground(Color.black);
		usuarioTF.setForeground(Color.LIGHT_GRAY);
		usuarioTF.setEditable(false);
		
		JLabel dataNowL = new JLabel("Data: ");
		dataNowL.setBounds(63,60,100,27);
		SimpleDateFormat formatted = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		String dataInic = formatted.format(new Date());
		MaskFormatter dateMask = null;
		try {
            dateMask = new MaskFormatter("##/##/#### ##:##");
            dateMask.setPlaceholderCharacter('_'); // Caracter que aparecerá no lugar dos números
        } catch (ParseException e) {
            e.printStackTrace();
        }
		dataFTF = new JFormattedTextField(dateMask);
		dataFTF.setValue(dataInic);
		dataFTF.setBounds(100,60,130,27);
		dataFTF.setFont(new Font("Arial", Font.PLAIN,14));
		dataFTF.setBackground(Color.black);
		dataFTF.setForeground(Color.LIGHT_GRAY);
		dataFTF.setEditable(false);
		
		JPanel subDivDireita = new JPanel();
		//subDivDireita.setBackground(Color.blue);
		subDivDireita.setBackground(new Color(169,169,169));
		subDivDireita.setLayout(null);
		tipoCB = new JComboBox(vTipoCB);
		JLabel tipoL = new JLabel("Tipo: ");
		tipoL.setBounds(195,60,100,27);
		tipoCB.setBounds(230,60,100,27);
		tipoCB.setFont(new Font("Arial", Font.PLAIN,14));
		tipoCB.setBackground(Color.black);
		tipoCB.setForeground(Color.white);
		

		//divisao1.setBackground(Color.green);
		divisao1.setLayout(new GridLayout(1,2));
		divisao1.add(subDivEsquerda);
		divisao1.add(subDivDireita);
		subDivDireita.add(tipoL);
		subDivDireita.add(tipoCB);
		subDivEsquerda.add(usuarioTF);
		subDivEsquerda.add(usuarioL);
		subDivEsquerda.add(dataFTF);
		subDivEsquerda.add(dataNowL);
		
		
		
		JPanel divisao2 = new JPanel();
		//divisao2.setBackground(Color.yellow);
		divisao2.setBackground(new Color(169,169,169));
		divisao2.setLayout(null);
		loteTF = new JTextField("Lote");
		JLabel loteL = new JLabel("Lote: ");
		loteL.setLayout(null);
		loteL.setBounds(12,10,100,27);
		loteTF.setBounds(44,10,100,27);
		loteTF.setFont(new Font("Arial", Font.PLAIN,14));
		loteTF.setBackground(Color.black);
		loteTF.setForeground(Color.white);
		
		validadeTF = new JTextField("Data de validade");
		JLabel validadeL = new JLabel("Validade: ");
		validadeL.setBounds(155,10,100,27);
		MaskFormatter dateMaskValid = null;
		try {
			dateMaskValid = new MaskFormatter("##/##/####");
			dateMaskValid.setPlaceholderCharacter('_'); // Caracter que aparecerá no lugar dos números
		} catch (ParseException e) {
		    e.printStackTrace();
		}
		validadeTF = new JFormattedTextField(dateMaskValid);
		validadeTF.setBounds(210,10,87,27);
		validadeTF.setFont(new Font("Arial", Font.PLAIN,14));
		validadeTF.setBackground(Color.black);
		validadeTF.setForeground(Color.white);
		
		marcaTF = new JTextField("Marca");
		JLabel marcaL = new JLabel("Marca: ");
		marcaL.setLayout(null);
		marcaL.setBounds(307,10,100,27);
		marcaTF.setBounds(350,10,100,27);
		marcaTF.setFont(new Font("Arial", Font.PLAIN,14));
		marcaTF.setBackground(Color.black);
		marcaTF.setForeground(Color.white);
		
		classCB = new JComboBox(vClassCB);
		JLabel classL = new JLabel("Classificação: ");
		classL.setLayout(null);
		classL.setBounds(458,10,100,27);
		classCB.setBounds(538,10,150,27);
		classCB.setFont(new Font("Arial", Font.PLAIN,14));
		classCB.setBackground(Color.black);
		classCB.setForeground(Color.white);
		
		JLabel obsL = new JLabel("Observação: ");
		obsL.setBounds(10,80,150,27);
		obsTF = new JTextField();
		obsTF.setBounds(85,80,250,27);
		obsTF.setFont(new Font("Arial", Font.PLAIN,14));
		obsTF.setBackground(Color.black);
		obsTF.setForeground(Color.white);
		
		fornecedorCB = new JComboBox(vFornecedorCB);
		JLabel fornecedorL = new JLabel("Fornecedor: ");
		fornecedorL.setLayout(null);
		fornecedorL.setBounds(400,80,100,27);
		fornecedorCB.setBounds(473,80,170,27);
		fornecedorCB.setFont(new Font("Arial", Font.PLAIN,14));
		fornecedorCB.setBackground(Color.black);
		fornecedorCB.setForeground(Color.white);
		
		divisao2.add(loteL);
		divisao2.add(loteTF);
		divisao2.add(validadeL);
		divisao2.add(validadeTF);
		divisao2.add(marcaL);
		divisao2.add(marcaTF);
		divisao2.add(classL);
		divisao2.add(classCB);
		divisao2.add(obsL);
		divisao2.add(obsTF);
		divisao2.add(fornecedorL);
		divisao2.add(fornecedorCB);
		
		
		
		JPanel divisao3 = new JPanel();
		divisao3.setLayout(new GridLayout(4,1));
		
		JPanel subDivPri = new JPanel();
		//subDivPri.setBackground(Color.cyan);
		subDivPri.setBackground(new Color(169,169,169));
		
		JPanel subDivSeg = new JPanel();
		//subDivSeg.setBackground(Color.DARK_GRAY);
		subDivSeg.setBackground(new Color(192,192,192));
		subDivSeg.setLayout(new FlowLayout(FlowLayout.LEFT,38,2));
		estoqueChB = new JCheckBox("Estoque  ");
		estoqueChB.setBackground(null);
		estoqueChB.setFocusable(false);
		devolucaoChB = new JCheckBox("Devolução");
		devolucaoChB.setBackground(null);
		devolucaoChB.setFocusable(false);
		reqSetorChB = new JCheckBox("Requisição por Setor");
		reqSetorChB.setBackground(null);
		reqSetorChB.setFocusable(false);
		subDivSeg.add(estoqueChB);
		subDivSeg.add(devolucaoChB);
		subDivSeg.add(reqSetorChB);
		
		JPanel subDivTer = new JPanel();
		//subDivTer.setBackground(Color.pink);
		subDivTer.setBackground(new Color(192,192,192));
		subDivTer.setLayout(new FlowLayout(FlowLayout.LEFT,38,2));
		inventarioChB = new JCheckBox("Inventario");
		inventarioChB.setBackground(null);
		inventarioChB.setFocusable(false);
		emprestimoChB = new JCheckBox("Emprestimo");
		emprestimoChB.setBackground(null);
		emprestimoChB.setFocusable(false);
		reqPrestChB = new JCheckBox("Requisição por Prestador");
		reqPrestChB.setBackground(null);
		reqPrestChB.setFocusable(false);
		subDivTer.add(inventarioChB);
		subDivTer.add(emprestimoChB);
		subDivTer.add(reqPrestChB);
		
		JPanel subDivQua = new JPanel();
		//subDivQua.setBackground(Color.white);
		subDivQua.setBackground(new Color(192,192,192));
		subDivQua.setLayout(new FlowLayout(FlowLayout.LEFT,38,2));
		prescChB = new JCheckBox("Prescrição Medica");
		prescChB.setBackground(null);
		prescChB.setFocusable(false);
		subDivQua.add(prescChB);
		divisao3.add(subDivPri);
		divisao3.add(subDivSeg);
		divisao3.add(subDivTer);
		divisao3.add(subDivQua);
		
		
		
		JPanel divisao4 = new JPanel();
		//divisao4.setBackground(Color.GRAY);
		divisao4.setBackground(new Color(192,192,192));
		divisao4.setLayout(new FlowLayout(FlowLayout.CENTER,190,30));
		cancelar = new JButton("Cancelar");
		cancelar.setFocusable(false);
		cancelar.addActionListener(this);
		cadastrar = new JButton("Cadastrar");
		cadastrar.setFocusable(false);
		cadastrar.addActionListener(this);
		divisao4.add(cancelar);
		divisao4.add(cadastrar);
		
		
		frame.add(divisao1);
		frame.add(divisao2);
		frame.add(divisao3);
		frame.add(divisao4);
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == cancelar) {
			frame.dispose();
		}else if(e.getSource() == cadastrar) {
			
		}
	}
	
}