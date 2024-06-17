package materiais;
import java.util.ArrayList;
import Diu.diu;
import Diu.solicitacao;
import materiais.Materiais;

public class EstoqueMateriais {
	
   private ArrayList<Material> materiais;
   
   public estoque(){
       materiais = new ArrayList<Material>();
   }
	
   // Metodos para os Materiais
   public void adicionarMaterial(Material material) {
	   materiais.add(material);
   }
   public void removerMaterial(Material material) {
	   materiais.remove(material);
   }
   public Material verMaterial(int posicao) {
	   return materiais.get(posicao);
   }
   public void entregaSolicitacao(int Quantidade) {
	   
   }
   
   
}
