package centraldecadastro.dao;

import java.sql.Connection;
import  java.sql.PreparedStatement;
import  java.sql.ResultSet;
import  java.sql.SQLException;
import  java.util.ArrayList;
import  java.util.List;


import centraldecadastro.jbdc.connection.FabricaConexao;
import centraldecadastro.model.CadCliente;



public class CadastroDao {
	private Connection cnn;
	
	public CadastroDao() {
		FabricaConexao fc = new FabricaConexao();
		cnn = fc.criarConexao();
	}
	
	public void incluir(CadCliente CadCliente) {
		try{
	String sql = "INSERT INTO cadcliente(codigo, pj_pf, razaos_nome, cnpj_cpf, rg_insest, telefone, email, atividade_profissao, cep, estado, cidade, rua, numero_complemento, bairro, site_instagram, ,observacao)";
	PreparedStatement sn = cnn.prepareStatement(sql);
	sn.setInt(1, CadCliente.getCodigo());
	sn.setString(2, CadCliente.getPj_Pf());
	sn.setString(3, CadCliente.getRazaos_Nome());
	sn.setString(4, CadCliente.getCnpj_Cpf());
	sn.setString(5 , CadCliente.getRg_Insest());
	sn.setLong(6, CadCliente.getTelefone());
	sn.setString(7 ,CadCliente.getEmail());
	sn.setString(8, CadCliente.getAtividade_Profissao());
	sn.setString(9, CadCliente.getCep());
	sn.setString(10 , CadCliente.getEstado());
	sn.setString(11, CadCliente.getCidade());
	sn.setString(12, CadCliente.getRua());
	sn.setString(13, CadCliente.getNumero_Complemento());
	sn.setString(14, CadCliente.getBairro());
	sn.setString(15, CadCliente.getSite_Instagram());
	sn.setString(16, CadCliente.getObservacao());
	sn.execute();
	sn.close();
		 } catch (SQLException e) { e.printStackTrace();
		    }
	}
public void alterar( CadCliente CadCliente) {
	try { String sql = "UPDATE cadcliente SET site_instagram = 'lais' WHERE site_instagram = 'lojasmoda' ";
	PreparedStatement sn = cnn.prepareStatement(sql);
	sn.setString(1, CadCliente.getSite_Instagram());
	sn.execute();
	 } catch (SQLException e) { e.printStackTrace();
	    }
	}
public void excluir (CadCliente CadCliente) {
	try {
	String sql = "DELETE FROM cadcliente WHERE observacao = 'tenho site'";
	PreparedStatement sn = cnn.prepareStatement(sql);
	sn.setString(1, CadCliente.getObservacao());
	sn.executeUpdate();
	sn.close();
	 } catch (SQLException e) { e.printStackTrace();
	    }
	
	}
}