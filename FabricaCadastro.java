package myapp;

import myapp.cadastro.Cadastro;

public class FabricaCadastro {
    static Cadastro criarCadastro (String nome, String email, Long telefone) {
        if ( ! (nome ==null || email == null || telefone ==null)){
        System.out.println("Valores invalidos");
        return null;
        
        }
        
        Cadastro cliente = new Cadastro();
        cliente.setNome(nome);
        cliente.setEmail(email);
        cliente.setTelefone(telefone);
        return cliente;
         }
}
