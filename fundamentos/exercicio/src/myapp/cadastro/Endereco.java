package myapp.cadastro;
public class Endereco{
private Long cep;
private String cidade;
private String numero;
private String bairro;
private String rua;
private String uf;

public Long getCep(){
    return cep;
}
public void setCep( Long cep){
    this.cep = cep;
}
public String getCidade(){
    return cidade;
}
public void setCidade( String cidade){
    this.cidade = cidade;
}
public String getNumero(){
    return numero;
}
public void setNumero( String numero){
    this.numero = numero;
}
public String getBairro(){
    return bairro;
}
public void setBairro( String bairro){
    this.bairro = bairro;
}
public String getRua(){
    return rua;
}
    public void setRua( String rua){
        this.rua = rua;
     }
    public String getUf(){
    return uf;
}
public void setUf( String uf){
    this.uf = uf;

}
}