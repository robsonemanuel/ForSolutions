
package model.bean;

import java.util.Date;

public class Orcamento extends Cliente {
   private float valorServico;
   private float valorPeca;
   private Date data;
    public Orcamento() {
    }

    public Orcamento(float valorServico, float valorPeca, Date data, String cpf, String email, String nome, String logradouro, int numero, String telefone, int id, String celular, String cnpj) {
        super(cpf, email, nome, logradouro, numero, telefone, id, celular, cnpj);
        this.valorServico = valorServico;
        this.valorPeca = valorPeca;
        this.data = data;
    }

    
    
}
