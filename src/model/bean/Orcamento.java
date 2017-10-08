
package model.bean;

import java.util.Date;

public class Orcamento extends Cliente {
   private float valorServico;
   private float valorPeca;
   private Date data;
    public Orcamento() {
    }

    public Orcamento(float valorServico, float valorPeca, Date data, String cpf, String email, String nome, String logradouro, String bairro, String cep, String cidade, int numero, String telefone, int id, String celular, String cnpj, String estado) {
        super(cpf, email, nome, logradouro, bairro, cep, cidade, numero, telefone, id, celular, cnpj, estado);
        this.valorServico = valorServico;
        this.valorPeca = valorPeca;
        this.data = data;
    }

    

   

    
    
}
