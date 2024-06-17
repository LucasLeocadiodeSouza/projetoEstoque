package materiais;


public class Material {
	
	private String produto;
	private Integer quantidade;
	
	public Material(String produto, Integer quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	
	public String getProduto() {
		return produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Material: " + produto + ", " + quantidade;
	}
	
	
}