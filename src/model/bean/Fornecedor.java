
package model.bean;


public class Fornecedor {
  private int id;
  private String Nome;
  private String Cnpj;
  private String Mercadoria;
  private String Contato;

    public Fornecedor() {
    }

    public Fornecedor(int id, String Nome, String Cnpj, String Mercadoria, String Contato) {
        this.id = id;
        this.Nome = Nome;
        this.Cnpj = Cnpj;
        this.Mercadoria = Mercadoria;
        this.Contato = Contato;
    }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCnpj() {
        return Cnpj;
    }

    public void setCnpj(String Cnpj) {
        this.Cnpj = Cnpj;
    }

    public String getMercadoria() {
        return Mercadoria;
    }

    public void setMercadoria(String Mercadoria) {
        this.Mercadoria = Mercadoria;
    }

    public String getContato() {
        return Contato;
    }

    public void setContato(String Contato) {
        this.Contato = Contato;
    }

   
  
  
}
