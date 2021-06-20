package myapp.cadastro;

public abstract class Produto {
    private Integer id;
    private String codigodBarras;
    private String titulo;
	private Double valorVenda;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCodigoBarras() {
		return codigodBarras;
	}
	public void setCodigoBarras(String codigoBarras) {
		this.codigodBarras = codigoBarras;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Double getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(Double valorVenda) {
		this.valorVenda = valorVenda;
	}
	
	
	
}

