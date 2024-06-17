package materiais;

public class SolicitacaoMaterial extends Material {

	protected String setorSolicitante;
	protected String setorRequerente;
	protected static int quantidadeSolicitada;
	protected boolean pendencia;
	
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

	public static int getQuantidadeSolicitada() {
		return quantidadeSolicitada;
	}

	public static void setQuantidadeSolicitada(int quantidadeSolicitada) {
		SolicitacaoMaterial.quantidadeSolicitada = quantidadeSolicitada;
	}

	public boolean isPendencia() {
		return pendencia;
	}

	public void setPendencia(boolean pendencia) {
		this.pendencia = pendencia;
	}
	
}
