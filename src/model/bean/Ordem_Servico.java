 
package model.bean;

import java.util.Date;

public class Ordem_Servico {
  private String descri_prod;
  private Date data;
  private String descri_def;
  private String nome;

    public Ordem_Servico() {
    }

    public Ordem_Servico(String descri_prod, Date data, String descri_def) {
        this.descri_prod = descri_prod;
        this.data = data;
        this.descri_def = descri_def;
    }

    public String getDescri_prod() {
        return descri_prod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public void setDescri_prod(String descri_prod) {
        this.descri_prod = descri_prod;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDescri_def() {
        return descri_def;
    }

    public void setDescri_def(String descri_def) {
        this.descri_def = descri_def;
    }
  
  
  

    
  
}
