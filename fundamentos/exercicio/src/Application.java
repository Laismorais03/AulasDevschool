 package myapp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import myapp.cadastro.Cadastro;
import myapp.cadastro.Camisa;
import myapp.cadastro.Empresa;
import myapp.cadastro.Endereco;
import myapp.cadastro.Produto;
import myapp.cadastro.Tenis;
import myapp.fabricacadastro.FabricaCadastro;
import myapp.pedido.Pedido;
import myapp.pedido.PedidoItem;

public class Application {

public static void main (String [] args){
        Cadastro cliente = new Cadastro();
        cliente.setNome("Lais Morais");
        cliente.setEmail("laismorais130@gmail.com");
        cliente.setTelefone(12345678901L);

        Cadastro marca1 = new Cadastro();
         marca1.setNome("Nike");

    Produto p1 = new Tenis();
    p1.setCodigodBarras("9234574345"); 
    p1.setTitulo("Air force");
    p1.setValorVenda(450.00);
    p1.setMarca(marca1);
  
   Cadastro marca2 = new Cadastro();
   marca2.setNome("Puma");

    Produto p2 = new Camisa();
    p2.setCodigodBarras("987357436");
    p2.setTitulo("Polo");
    p2.setValorVenda(87.99);
    p2.setMarca(marca2);


    Cadastro marca3 = new Cadastro();
    marca3.setNome("Adidas");

    Produto p3 = new Tenis();
    p3.setCodigodBarras("836346894");
    p3.setTitulo("Jordan");
    p3.setValorVenda(1500.00);
    p3.setMarca(marca3);

    Empresa empresa = new Empresa(39745765l, 873652536l);
    Cadastro cadasEmpresa = new Cadastro();
    cadasEmpresa.setCpfCnpj("54673678900004");
    cadasEmpresa.setEmail("lojasmoda@shopping.com");
    cadasEmpresa.setNome("Moda Shopping");
    cadasEmpresa.setTelefone(11965465436l);
    empresa.setCadastro(cadasEmpresa);

Endereco endereco = new Endereco();
endereco.setBairro("Vila Silviania");
endereco.setCep(54637828L);
endereco.setCidade("Carapicuíba");
endereco.setRua("Enertina Vieria");
endereco.setNumero("872");
endereco.setUf("SP");
cadasEmpresa.setEndereco(endereco);

    Pedido pedido = new Pedido();
    Cadastro comprador = FabricaCadastro.criarCadastro("Lais", "laismorais130@gmail.com", 12345678901L );

    pedido.setComprador(comprador);
pedido.setData(new Date ());
    pedido.setValorTotal(2307.99);
    pedido.setId(13246);
    pedido.setCcf(98);
    pedido.setCoo(270);

    
    List<PedidoItem> itens = new ArrayList();
PedidoItem item = new PedidoItem();
item.setProduto(p1);
item.setQuantidade(0.1);
item.setValorVenda(p1.getValorVenda());
item.setValorTotal(item.getQuantidade() * item.getValorVenda());

itens.add(item);
item = new PedidoItem();
item.setProduto(p2);
item.setQuantidade(0.1);
item.setValorVenda(p2.getValorVenda());
item.setValorTotal(item.getQuantidade() * item.getValorVenda());


itens.add(item);
item = new PedidoItem();
item.setProduto(p3);
item.setQuantidade(1.0);
item.setValorVenda(p3.getValorVenda());
item.setValorTotal(item.getQuantidade() * item.getValorVenda());

 pedido.setItens(itens);

 ImpreApp.gerarCupom();
}
}
