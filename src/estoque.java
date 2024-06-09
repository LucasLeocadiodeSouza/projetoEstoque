import java.util.ArrayList;

public class estoque {
	
   private ArrayList<diu> dius;
   private ArrayList<solicitacao> solicitacoes;
   
   public estoque(){
       dius = new ArrayList<diu>();
       solicitacoes = new ArrayList<solicitacao>();
   }
   
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
   public void cadastrarDiu(diu diu){
       dius.add(diu);
   }
	
}
