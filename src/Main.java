import java.util.Scanner;

import frames.HomeWindow;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		//gravando os construtores 
			EstoqueMateriais estoqueMat = new EstoqueMateriais();
			Tipo tipoMat = new Tipo();
			Material material = new Material();
			
		String sair = null;
		do {
			//gravando o tipo de material
			System.out.print("Digite o tipo do produto: ");
			String tipo = sc.nextLine();
			tipoMat.setNome(tipo);
			
			//gravando o material
			System.out.print("Digite o nome do produto: ");
			String nomeMaterial = sc.nextLine();
			material.setNome(nomeMaterial);
			material.setEstoqueMateriais(estoqueMat);
			material.setTipo(tipoMat);
			
			//gravando material no estoque
			System.out.print("Digite a quantidade: ");
			Integer quantity = sc.nextInt();
			sc.nextLine();
			estoqueMat.setQuantidade(quantity);
			estoqueMat.addMatEst(material);
				
			//adicionando as ArrayLists
			tipoMat.addMaterial(material);
			
			
			System.out.print("deseja sair?");
			sair = sc.nextLine();
			
			
		}while(!sair.contentEquals("sair"));
		
		System.out.println("acoes: ");
		System.out.println("ver materiais em estoque");
		System.out.println("solicitacao de materiais");
		String acao = sc.nextLine();
		if(!acao.contentEquals("ver materiais em estoque")) {
			for(int n = 0; n < estoqueMat.lenghtMat(); n++) {
				estoqueMat.verMat(n);
			}
		}else if (acao.contentEquals("solicitacao de materiais")) {
			
		}
		*/
		
		HomeWindow homewindow = new HomeWindow();
		
		sc.close();
	}
}