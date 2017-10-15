
package model.bean;

import java.util.Date;

public class Orcamento extends Cliente {
   private float valorServico;
   private float valorPeca;
   private String descricao;
   private Date data;
   private String nome;
   
    public Orcamento() {
    }

    public Orcamento(float valorServico, float valorPeca, String descricao, Date data, String cpf, String email, String nome, String logradouro, String bairro, String cep, String cidade, int numero, String telefone, int id, String celular, String cnpj, String estado) {
        super(cpf, email, nome, logradouro, bairro, cep, cidade, numero, telefone, id, celular, cnpj, estado);
        this.valorServico = valorServico;
        this.valorPeca = valorPeca;
        this.descricao = descricao;
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

   

    public float getValorServico() {
        return valorServico;
    }

    public void setValorServico(float valorServico) {
        this.valorServico = valorServico;
    }

    public float getValorPeca() {
        return valorPeca;
    }

    public void setValorPeca(float valorPeca) {
        this.valorPeca = valorPeca;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    

   

    
    
}
