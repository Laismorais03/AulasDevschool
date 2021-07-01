package myapp;

import java.util.List;
import myapp.cadastro.Empresa;
import myapp.cadastro.Endereco;
import myapp.formatacao.Format;
import myapp.pedido.PedidoItem;
import myapp.pedido.Pedido;


public class ImpreApp {

    public static String imprimirCupom(Pedido pedido) {
        Empresa empresa = pedido.getEmpresa();
		
		System.out.println(empresa.getCadastro().getEndereco());
		
		Endereco endereco = empresa.getCadastro().getEndereco();
		String cep = endereco.getCep().toString().replaceAll( ("(\\d{2})(\\d{3})(\\d{3})"), "$1.$2-$3");
		
		StringBuilder sb = new StringBuilder();
		sb.append("----------------------------------------------------------------\n");
		sb.append(empresa.getCadastro().getNome() + "\n");
		sb.append(String.format("%s, %s, %s - %s - %s Cep: %s \n", endereco.getRua(), endereco.getNumero(),endereco.getBairro(), endereco.getCidade(),endereco.getUf(), cep   ));
		sb.append(String.format("CNPJ: %s \n", Format.formatCnpj(empresa.getCadastro().getCpfCnpj())));
		sb.append(String.format("IE: %s\nIM: %s\n",empresa.getIe().toString().replaceAll( ("(\\d{3})(\\d{3})(\\d{3})"), "$1.$2.$3"), 
				empresa.getIm().toString().replaceAll( ("(\\d{2})(\\d{3})(\\d{3})"), "$1.$2.$3")));
		sb.append("----------------------------------------------------------------\n");
		
		//NUMA LINHA DATA FORMATADA - CCF (6) DIGITOS - COO (6DIGITOS)
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
		String dataFormatada = formatador.format(pedido.getData());
		sb.append(String.format("%-40s CCF:%06d CCO:%06d",dataFormatada, pedido.getCcf(), pedido.getCoo()) );
		sb.append("\n----------------------------------------------------------------\n");
		sb.append(String.format("%-35s%10s%10s%10s\n", "ITEM","QUANT", "R$ UNIT", "R$ TOTAL"));
		
		sb.append(String.format("%-58s %.2f\n","TOTAL", pedido.getValorTotal()));
		sb.append("\n----------------------------------------------------------------\n");
		List<PedidoItem> itens = pedido.getItens();
		
		
		for(PedidoItem uItem: itens) {
			String q = String.format("%.2f",uItem.getQuantidade());
			String vu = String.format("%.2f",uItem.getValorVenda());
			String vt = String.format("%.2f",uItem.getValorTotal());
			
			sb.append(String.format("%-35s%10s%10s%10s\n",uItem.getProduto().getTitulo(),  q,vu,vt));
			
		}
		
	}	
		System.out.println(sb.toString());
		return sb.toString();
	



}


