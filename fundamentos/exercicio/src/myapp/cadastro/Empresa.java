package myapp.cadastro;

public class Empresa  extends Cadastro{
    private Cadastro cadastro;
    private Long ie ;
    private Long im;
    private String cpfcnpj;
 public Empresa (Long ie, long im){
     this.ie = ie;
     this.im = im;
    }


     public Long getIm(){
 return  im;
}
   public Long getIe(){
    return ie;
}
  public void setCadastro (Cadastro cadastro){
this.cadastro = cadastro;
 }
  public Cadastro getCadastro() {
      return cadastro;
  } 
    public String getCpfCnpj() {
          return cpfcnpj;
              }
  public void setCpfCnpj (String cpfcnpj){
    this.cpfcnpj = cpfcnpj;
     }
   
}

