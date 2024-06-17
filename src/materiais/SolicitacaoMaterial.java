package materiais;

public class SolicitacaoMaterial extends Material {

	private String setorSolicitante;
	private String setorRequerente;
	private int quantidadeSolicitada;
	
	public SolicitacaoMaterial(String produto, Integer quantidade, String setorRequerente, String setorSolicitante, int quantidadeSolicitada) {
		super(produto, quantidade);
		this.setorRequerente = setorRequerente;
		this.setorSolicitante = setorSolicitante;
		this.quantidadeSolicitada = quantidadeSolicitada;
	}

	public String getSetorSolicitante() {
		return setorSolicitante;
	}

	public void setSetorSolicitante(String setorSolicitante) {
		this.setorSolicitante = setorSolicitante;
	}

	public String getSetorRequerente() {
		return setorRequerente;
	}

	public void setSetorRequerente(String setorRequerente) {
		this.setorRequerente = setorRequerente;
	}

	public int getQuantidadeSolicitada() {
		return quantidadeSolicitada;
	}

	public void setQuantidadeSolicitada(int quantidadeSolicitada) {
		this.quantidadeSolicitada = quantidadeSolicitada;
	}

	
	
}
