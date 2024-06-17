package materiais;


public class Material {
	
	protected String produto;
	protected static Integer quantidade;
	
	public Material(String produto, Integer quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Material: " + produto + ", " + quantidade;
	}
	
	
}