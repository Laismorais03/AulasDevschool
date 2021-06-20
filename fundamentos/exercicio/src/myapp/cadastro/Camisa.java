package myapp.cadastro;

public class Camisa extends Produto {
    private Cadastro marca;
    private String tamanho;

    public Cadastro getMarca(){
        return marca;
    }
public void setMarca(Cadastro marca){
    this.marca = marca;

}
public String getTamanho(){
    return tamanho;
}
public void setTamanho(String tamanho){
    this.tamanho = tamanho;
}
}
