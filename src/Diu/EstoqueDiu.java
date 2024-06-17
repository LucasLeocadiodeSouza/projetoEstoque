package Diu;
import java.util.ArrayList;

public class EstoqueDiu {

	 private ArrayList<diu> dius;
	 private ArrayList<solicitacao> solicitacoes;
	 
	 
	 public EstoqueDiu(){
	       dius = new ArrayList<diu>();
	       solicitacoes = new ArrayList<solicitacao>();	     
	   }
	 
	   // Metodos para Solicitar implantação de Diu   
	   public int tamanhoSolicitacao(){
	       return solicitacoes.size();
	   }
	   public void adicionarSolicitacao(solicitacao solicitacao){
	       solicitacoes.add(solicitacao);
	   }
	   public void removerSolicitacao(solicitacao solicitacao){
	       solicitacoes.remove(solicitacao);
	   }
	   public solicitacao verSolicitacao(int posicao){
	       return solicitacoes.get(posicao);
	   }
	 
	   // Metodos para cadastrar o Diu
	   public void cadastrarDiu(diu diu){
	       dius.add(diu);
	   }
	   
	   
	   
}
