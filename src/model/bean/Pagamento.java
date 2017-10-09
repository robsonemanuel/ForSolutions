
package model.bean;

public class Pagamento {
  private int codigo;  
  private float valor;
  private String forma_pagamento;
  public int vezes ;
  private String data_venda; 

    public Pagamento() {
    }

    public Pagamento(int codigo, float valor, String forma_pagamento, int vezes, String data_venda) {
        this.codigo = codigo;
        this.valor = valor;
        this.forma_pagamento = forma_pagamento;
        this.vezes = vezes;
        this.data_venda = data_venda;
    }
  
   
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getForma_pagamento() {
        return forma_pagamento;
    }

    public void setForma_pagamento(String forma_pagamento) {
        this.forma_pagamento = forma_pagamento;
    }

    public int getVezes() {
        return vezes;
    }

    public void setVezes(int vezes) {
        this.vezes = vezes;
    }

    public String getData_venda() {
        return data_venda;
    }

    public void setData_venda(String data_venda) {
        this.data_venda = data_venda;
    }
}
