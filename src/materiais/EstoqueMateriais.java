package materiais;
import java.util.ArrayList;
import Diu.diu;
import Diu.solicitacao;
import materiais.Materiais;

public class EstoqueMateriais {
	
   private ArrayList<Material> materiais;
   private ArrayList<SolicitacaoMaterial> solicitacoes;
   
   public EstoqueMateriais(){
       materiais = new ArrayList<Material>();
   }
	
   // Metodos para as solicitacoes
   public void adicionarMaterial(Material material) {
	   materiais.add(material);
   }
   public void removerMaterial(Material material) {
	   materiais.remove(material);
   }
   public Material verMaterial(int posicao) {
	   return materiais.get(posicao);
   }
   
   //metodos para solicitacoes
   public void fazerSolicitacao(SolicitacaoMaterial SolicitacaoMaterial) {
	   solicitacoes.add(SolicitacaoMaterial);
   }
   public void baixaSolicitacao() {
		   Material.quantidade -= SolicitacaoMaterial.quantidadeSolicitada;   
   }
   public SolicitacaoMaterial verSolicitacoes(int posicao) {
	   return solicitacoes.get(posicao);
   }
   
   
}
