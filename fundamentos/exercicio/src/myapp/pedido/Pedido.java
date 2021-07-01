package myapp.pedido;
import java.util.Date;
import java.util.List;

import myapp.cadastro.Cadastro;
import myapp.cadastro.Empresa;

public class Pedido {
	private Integer id;
	private Date data;
	private Double valorTotal;
	private Cadastro comprador;
	private Integer Ccf;
	private Integer Coo;
	private Empresa empresa;
	public Cadastro getComprador() {
		return comprador;
	}
	public void setComprador(Cadastro comprador) {
		this.comprador = comprador;
	}
	private List<PedidoItem> itens;

	public void setItens(List<PedidoItem> itens) {
		this.itens = itens;
	}
	public List<PedidoItem> getItens() {
		return itens;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public Integer getCoo() {
		return Coo;
	}
	public void setCoo(Integer Coo) {
		this.Coo =  Coo;
}
public Integer getCcf() {
	return Ccf;
}
public void setCcf(Integer Ccf) {
	this.Ccf = Ccf;}

public Empresa getEmpresa() {
	return empresa;
}
public void setEmpresa(Empresa empresa) {
	this.empresa = empresa;
}
}