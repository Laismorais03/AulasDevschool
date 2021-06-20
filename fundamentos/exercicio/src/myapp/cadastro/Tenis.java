package myapp.cadastro;

public class Tenis extends Produto {
   private Cadastro marca;
   private Integer tamanho;
   public Cadastro getMarca(){
    return marca;
}
public void setMarca(Cadastro marca){
this.marca = marca;

}
public Integer getTamanho(){
return tamanho;
}
public void setTamanho(Integer tamanho){
this.tamanho = tamanho;
}
}
